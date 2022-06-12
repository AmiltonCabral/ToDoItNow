package com.amiport.todoitnow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amiport.todoitnow.repository.PersonRepository;
import com.amiport.todoitnow.repository.ToDoRepository;

@Service
public class ToDoService {
    
    @Autowired
    private ToDoRepository toDoRep;

    @Autowired
    private PersonRepository personRep;
    
    public void setJobDone(String id, boolean done) {
        if (this.personRep.getDelAfterDone(id)) {
            this.toDoRep.delJob(id);
        } else {
            this.toDoRep.setJobDone(id, done);
        }
    }
}
