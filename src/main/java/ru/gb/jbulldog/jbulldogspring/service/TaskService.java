package ru.gb.jbulldog.jbulldogspring.service;

public interface TaskService<T> {
   T addTask(String message);
   boolean removeTask(T task);
   T changeTask(T task);
}
