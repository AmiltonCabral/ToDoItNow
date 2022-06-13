package com.amiport.todoitnow.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.amiport.todoitnow.model.Person;

@Repository
public class PersonRepository {

    private Map<String, Person> personCollection = new HashMap<String, Person>();

    public String addPerson(Person person) {
        this.personCollection.put(person.getId(), person);
        return person.getId();
    }

    public boolean getDelAfterDone(String id) {
        return this.personCollection.get(id).getDelAfterDone();
    }

    public Collection<Person> listPeople() {
        return this.personCollection.values();
    }
}
