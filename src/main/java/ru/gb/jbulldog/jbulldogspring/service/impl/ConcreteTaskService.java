package ru.gb.jbulldog.jbulldogspring.service.impl;

import org.springframework.stereotype.Service;
import ru.gb.jbulldog.jbulldogspring.data.Task;
import ru.gb.jbulldog.jbulldogspring.service.TaskService;

@Service
public class ConcreteTaskService implements TaskService<Task> {

    @Override
    public Task addTask(String message) {
        return null;
    }

    @Override
    public boolean removeTask(Task task) {
        return false;
    }

    @Override
    public Task changeTask(Task task) {
        return null;
    }

}
