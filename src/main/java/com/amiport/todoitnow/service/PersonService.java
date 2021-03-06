package com.amiport.todoitnow.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amiport.todoitnow.dto.PersonDTO;
import com.amiport.todoitnow.model.Person;
import com.amiport.todoitnow.repository.PersonRepository;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;
    

    public String addPerson(PersonDTO personDTO) {
        Person person = new Person(personDTO.getName(), personDTO.getSurname());
        return this.personRepository.addPerson(person);
    }

    public List<Person> listPeople() {
        return new ArrayList<Person>(this.personRepository.listPeople());
    }
}
