package com.amiport.todoitnow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amiport.todoitnow.dto.JobDTO;
import com.amiport.todoitnow.model.ToDo;
import com.amiport.todoitnow.service.ToDoService;

@Controller
@RequestMapping("/api")
@CrossOrigin
public class ToDoController {

    @Autowired
    private ToDoService toDoService;


    @RequestMapping(value = "/jobs/", method = RequestMethod.POST)
    public ResponseEntity<?> createJob(String toDoListID, @RequestBody JobDTO jobDTO) {
        this.toDoService.addJob(toDoListID, jobDTO);
        
        // tem como melhorar entidade de resposta, passando id da job e da pessoa
        return new ResponseEntity<String>("Job Criada", HttpStatus.CREATED);
    }


    @RequestMapping(value = "/todo/", method = RequestMethod.GET)
    public ResponseEntity<List<ToDo>> listToDo() {
        return new ResponseEntity<List<ToDo>>(this.toDoService.listToDo(), HttpStatus.OK);
    }
}