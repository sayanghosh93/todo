package com.sayan.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository repository;

    @Autowired
    private GetToDoListDto dto;

    public GetToDoListDto getToDoList() {
        dto.setList(repository.findAll());
        return dto;
    }

    public void addToDo(ToDoEntity entity) {
        repository.save(entity);
    }

    public void updateToDoList(ToDoEntity entity) {
        repository.save(entity);
    }

    public void deleteToDoList(int id) {
        repository.deleteById(id);
    }
}
