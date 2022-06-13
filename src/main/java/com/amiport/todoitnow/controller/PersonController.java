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

import com.amiport.todoitnow.dto.PersonDTO;
import com.amiport.todoitnow.model.Person;
import com.amiport.todoitnow.service.PersonService;

@Controller
@RequestMapping("/api")
@CrossOrigin
public class PersonController {
    
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/people/", method = RequestMethod.POST)
    public ResponseEntity<String> createPerson(@RequestBody PersonDTO personDTO) {
        return new ResponseEntity<String>(this.personService.addPerson(personDTO), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/people/", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> listPeople() {
        return new ResponseEntity<List<Person>>(this.personService.listPeople(), HttpStatus.OK);
    }
}
