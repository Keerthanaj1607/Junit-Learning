import org.example.toDo.Task;
import org.example.toDo.TaskRepository;
import org.example.toDo.TaskService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TaskServiceTest {

    @Test
    public void testGetTasksByStatus() {
        TaskRepository repo = new TaskRepository();
        TaskService service = new TaskService(repo);

        service.createTask("Task 1", "Description 1", "IN_PROGRESS");
        service.createTask("Task 2", "Description 2", "COMPLETED");
        service.createTask("Task 3", "Description 3", "IN_PROGRESS");

        List<Task> inProgressTasks = service.getTasksByStatus("IN_PROGRESS");

        assertEquals(2, inProgressTasks.size());
        for (Task task : inProgressTasks) {
            assertEquals("IN_PROGRESS", task.getStatus());
        }
    }
    @Test
    public void testGetTasksByStatusWithNullShouldThrowException(){
        TaskRepository repo = new TaskRepository();
        TaskService service = new TaskService(repo);
 Exception exception =assertThrows(IllegalArgumentException.class,()->{
     service.getTasksByStatus(null);
 });
        assertEquals("Status must not be null or empty", exception.getMessage());
    
    }
}
