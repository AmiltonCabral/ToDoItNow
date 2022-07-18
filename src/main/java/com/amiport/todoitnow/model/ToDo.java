package com.amiport.todoitnow.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ToDo {
    private Map<String, Job> toDoList;

    public ToDo() {
        this.toDoList = new HashMap<String, Job>();
    }

    public Job getJob(String id) {
        return this.toDoList.get(id);
    }

    public void addJob(Job job) {
        this.toDoList.put(job.getId(), job);
    }

    public void delJob(String id) {
        this.toDoList.remove(id);
    }

    public Collection<Job> listToDo() {
        return this.toDoList.values();
    }

    @Override
    public String toString() {
        return "To Do List=" + toDoList.values();
    }

}
