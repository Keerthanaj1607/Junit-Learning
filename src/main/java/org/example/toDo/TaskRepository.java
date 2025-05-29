package org.example.toDo;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private List<Task> tasks= new ArrayList<>();
    public void save(Task task) {
        tasks.add(task);
    }

    public List<Task> findAll() {
        return tasks;
    }
}
