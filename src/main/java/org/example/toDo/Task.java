package org.example.toDo;

public class Task {
    private int id;
    private String title;
    private String description;
    // new , in_progress,completed
    private  String status;
    public Task(int id, String title, String description, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public String getStatus() {
        return  status;
    }
}
