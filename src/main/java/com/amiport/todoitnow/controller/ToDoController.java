package com.amiport.todoitnow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amiport.todoitnow.dto.JobDTO;
import com.amiport.todoitnow.model.Job;
import com.amiport.todoitnow.service.ToDoService;

@Controller
@RequestMapping("/api")
@CrossOrigin
public class ToDoController {

    @Autowired
    private ToDoService toDoService;


    @RequestMapping(value = "/jobs/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> createJob(@PathVariable("id") String personID, @RequestBody JobDTO jobDTO) {
        String jobId = this.toDoService.addJob(personID, jobDTO);

        return new ResponseEntity<String>("Job Criada com ID: " + jobId, HttpStatus.CREATED);
    }


    @RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<Job>> listJobs(@PathVariable("id") String personID) {
        return new ResponseEntity<List<Job>>(this.toDoService.listJobs(personID), HttpStatus.OK);
    }
}