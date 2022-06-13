package com.amiport.todoitnow.repository;

import java.util.Collection;
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

    public void addJob(String toDoID, Job job) {
        //this.toDoCollection.get(toDoID).addJob(job);
        ToDo toDo = this.toDoCollection.get(toDoID);
        toDo.addJob(job);
        this.toDoCollection.replace(toDoID, toDo);
    }

    public void delJob(String id) {
        this.toDoCollection.remove(id);
    }

    public void setJobDone(String id, boolean done) {
//        this.toDoCollection.get(id).setDone(done);
        this.toDoCollection.get(id).getJob(id).setDone(done);
    }

    public Collection<ToDo> listToDo() {
        return this.toDoCollection.values();
    }
}