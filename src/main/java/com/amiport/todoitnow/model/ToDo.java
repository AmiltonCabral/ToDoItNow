package com.amiport.todoitnow.model;

import java.util.HashMap;
import java.util.Map;

public class ToDo {
    private String personId;
    private Map<String, Job> toDoList = new HashMap<String, Job>();

    public ToDo(String personId) {
        this.personId = personId;
    }

    public String getPersonId() {
        return this.personId;
    }

    /*
    public List<Job> getToDoList() {
        return this.toDoList;
    }
    */

    public Job getJob(String id) {
        return this.toDoList.get(id);
    }

    public void addJob(Job job) {
        this.toDoList.put(job.getId(), job);
    }
}
