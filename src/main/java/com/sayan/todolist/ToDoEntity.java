package com.sayan.todolist;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class ToDoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "to_do")
    private String toDo;

    @Column(name = "is_checked")
    private boolean isChecked;

    @Override
    public String toString() {
        return "ToDoEntity{" +
                "id=" + id +
                ", toDo='" + toDo + '\'' +
                ", isChecked=" + isChecked +
                '}';
    }
}
