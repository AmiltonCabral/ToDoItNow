package com.amiport.todoitnow.repository;

import java.util.HashMap;
import java.util.Map;

import com.amiport.todoitnow.model.ToDo;

/**
 * ToDoListRepository
 */
public class ToDoRepository {

    private Map<String, ToDo> toDoRep;

    public ToDoRepository() {
        this.toDoRep = new HashMap<String, ToDo>();
    }

    public String addToDo(ToDo toDo) {
        this.toDoRep.put(toDo.getPersonId(), toDo);
        return toDo.getPersonId();
    }
}