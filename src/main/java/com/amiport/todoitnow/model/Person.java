package com.amiport.todoitnow.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Person {
    private String id;
    private String name;
    private String surname;
    private boolean delAfterDone;
    private ToDo toDo;

    public Person(String name, String surname) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
        this.delAfterDone = false;
        this.toDo = new ToDo();
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public boolean getDelAfterDone() {
        return this.delAfterDone;
    }

    public void setDelAfterDone(boolean delAfterDone) {
        this.delAfterDone = delAfterDone;
    }

    public void addJob(Job job) {
        this.toDo.addJob(job);
    }

    public void delJob(String id) {
        this.toDo.delJob(id);
    }

    public void setJobDone(String id, boolean done) {
        this.toDo.getJob(id).setDone(done);
    }

    public List<Job> listJobs() {
        return new ArrayList<Job>(this.toDo.listToDo());
    }
}
