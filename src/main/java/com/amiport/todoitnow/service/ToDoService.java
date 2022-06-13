package com.amiport.todoitnow.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amiport.todoitnow.dto.JobDTO;
import com.amiport.todoitnow.model.Job;
import com.amiport.todoitnow.model.ToDo;
import com.amiport.todoitnow.repository.PersonRepository;
import com.amiport.todoitnow.repository.ToDoRepository;

@Service
public class ToDoService {
    
    @Autowired
    private ToDoRepository toDoRep;

    @Autowired
    private PersonRepository personRep;

    
    public void addJob(String toDoID, JobDTO jobDTO) {
        Job job = new Job(jobDTO.getName(), jobDTO.getPriority());
        this.toDoRep.addJob(toDoID, job);
    }

    
    public void setJobDone(String id, boolean done) {
        if (this.personRep.getDelAfterDone(id)) {
            this.toDoRep.delJob(id);
        } else {
            this.toDoRep.setJobDone(id, done);
        }
    }


    public List<ToDo> listToDo() {
        return new ArrayList<ToDo>(this.toDoRep.listToDo());
    }
}
