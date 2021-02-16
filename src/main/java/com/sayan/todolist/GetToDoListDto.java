package com.sayan.todolist;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class GetToDoListDto {
    private List<ToDoEntity> list;
}
