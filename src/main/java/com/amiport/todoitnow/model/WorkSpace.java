package com.amiport.todoitnow.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WorkSpace {
    private String id;
    private String name;
    private List<Person> group;
    
    public WorkSpace(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.group = new ArrayList<Person>();
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Person> getGroup() {
        return this.group;
    }
}
