package com.sayan.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/")
    public GetToDoListDto getToDoList() {
        return toDoService.getToDoList();
    }

    @PostMapping("/add")
    public void addToDo(@RequestBody ToDoEntity toDoEntity) {
        toDoService.addToDo(toDoEntity);
    }

    @PostMapping("/update")
    public void updateToDo(@RequestBody ToDoEntity toDoEntity) {
        toDoService.updateToDoList(toDoEntity);
    }

    @PutMapping("/delete{id}")
    public void deleteToDo(@RequestParam(name = "id") int id) {
        toDoService.deleteToDoList(id);
    }
}
