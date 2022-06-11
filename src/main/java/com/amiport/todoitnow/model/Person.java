package com.amiport.todoitnow.model;

import java.util.UUID;

public class Person {
    private String id;
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }
}
