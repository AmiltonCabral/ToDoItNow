package com.amiport.todoitnow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amiport.todoitnow.dto.JobDTO;
import com.amiport.todoitnow.model.Job;
import com.amiport.todoitnow.repository.PersonRepository;

@Service
public class ToDoService {

    @Autowired
    private PersonRepository personRep;

    
    public String addJob(String personId, JobDTO jobDTO) {
        Job job = new Job(jobDTO.getName(), jobDTO.getPriority());
        this.personRep.addJob(personId, job);
        return job.getId();
    }

    
    public void setJobDone(String personId, String jobId, boolean done) {
        if (this.personRep.getDelAfterDone(personId)) {
            this.personRep.getPerson(personId).delJob(jobId);
        } else {
            this.personRep.getPerson(personId).setJobDone(jobId, true);
        }
    }


    public List<Job> listJobs(String personId) {
        return this.personRep.getPerson(personId).listJobs();
    }
}
