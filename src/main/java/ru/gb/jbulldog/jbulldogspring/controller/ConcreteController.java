package ru.gb.jbulldog.jbulldogspring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.jbulldog.jbulldogspring.data.Task;
import ru.gb.jbulldog.jbulldogspring.service.TaskService;

@RestController
@RequestMapping
public class ConcreteController {

    TaskService<Task> taskService;

    public ConcreteController(TaskService<Task> concreteTaskService){
        this.taskService = concreteTaskService;
    }

    @PutMapping
    public void createTask(){
        System.out.println("CREATE");
    }

    @PostMapping
    public void updateTask(){
        System.out.println("UPDATE");
    }

    @DeleteMapping
    public void deleteTask(){
        System.out.println("DELETE");
    }

    @GetMapping
    public void getTask(){
        System.out.println("GET");
    }

}
