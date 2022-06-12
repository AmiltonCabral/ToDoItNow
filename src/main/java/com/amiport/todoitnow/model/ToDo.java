package com.amiport.todoitnow.model;

import java.util.List;

public class ToDo {
    private String personId;
    private List<Job> toDoList;
    private boolean done;

    public ToDo(String personId) {
        this.personId = personId;
        this.done = false;
    }

    public String getPersonId() {
        return this.personId;
    }

    public List<Job> getToDoList() {
        return this.toDoList;
    }

    public void addJob(Job job) {
        this.toDoList.add(job);
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean getDone() {
        return done;
    }
}
