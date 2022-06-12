package com.amiport.todoitnow.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.amiport.todoitnow.model.Job;
import com.amiport.todoitnow.model.ToDo;

/**
 * ToDoListRepository
 */
@Repository
public class ToDoRepository {

    private Map<String, ToDo> toDoCollection = new HashMap<String, ToDo>();

    public String addToDo(ToDo toDo) {
        this.toDoCollection.put(toDo.getPersonId(), toDo);
        return toDo.getPersonId();
    }

    public void addJob(String id, Job job) {
        this.toDoCollection.get(id).addJob(job);
    }

    public void delJob(String id) {
        this.toDoCollection.remove(id);
    }

    public void setJobDone(String id, boolean done) {
        this.toDoCollection.get(id).setDone(done);
    }
}