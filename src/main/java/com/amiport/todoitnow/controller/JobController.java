package com.amiport.todoitnow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
@CrossOrigin
public class JobController {

    @RequestMapping(value = "/jobs/", method = RequestMethod.GET)
    public ResponseEntity<String> teste() {
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }

}