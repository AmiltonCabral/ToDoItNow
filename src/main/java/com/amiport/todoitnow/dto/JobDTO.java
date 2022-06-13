package com.amiport.todoitnow.dto;

public class JobDTO {
    
    private String name;
    private int priority;

    public JobDTO(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return this.name;
    }

    public int getPriority() {
        return this.priority;
    }
}
