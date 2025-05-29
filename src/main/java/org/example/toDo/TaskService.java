package org.example.toDo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskService {
    private TaskRepository repository;
    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }
    public void createTask(String title, String description, String status) {
        int id = repository.findAll().size() + 1;
        Task task = new Task(id, title, description, status);
        repository.save(task);
    }
    public List<Task> getAllTasks() {
        return repository.findAll();
    }
    public List<Task> getTasksByStatus(String status) {
        //Validations added
        if (status == null || status.isEmpty()) {
            throw new IllegalArgumentException("Status must not be null or empty");
        }
        List<Task> result = new ArrayList<>();
        for (Task task : repository.findAll()) {
            if (task.getStatus().equals(status)) {
                result.add(task);
            }
        }
        return result;
    }

}

