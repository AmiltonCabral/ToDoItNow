package com.amiport.todoitnow.model;

import java.sql.Date;
import java.util.UUID;

public class Job {
    
    private String id;
    private String name;
    private Date jobDate;
    private boolean done;
    
    // From 1 to 3, 1 has more priority than 2 and so on.
    private int priority;
    

    public Job(String name, int priority) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.priority = priority;
        this.done = false;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getPriorityString() {
        if (this.priority <= 1) {
            return "High";
        }
        else if (this.priority == 2) {
            return "Medium";
        }
        else {
            return "Low";
        }
    }

    public Date getJobDate() {
        return this.jobDate;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean getDone() {
        return this.done;
    }

    @Override
    public String toString() {
        return "Job [done=" + done + ", id=" + id + ", Job Date=" + jobDate + ", Name=" + name + ", Priority=" + priority
                + "]";
    }

}
