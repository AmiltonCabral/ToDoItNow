package com.amiport.todoitnow.dto;

public class PersonDTO {
    
    private String name;
    private String surname;

    public PersonDTO(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
}
