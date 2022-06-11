package com.amiport.todoitnow.model;

import java.util.List;

public class ToDo {
    private String personId;
    private List<Job> toDoList;

    public ToDo(String personId) {
        this.personId = personId;
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
}
