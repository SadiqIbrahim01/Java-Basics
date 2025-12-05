import java.util.ArrayList;
import java.util.HashMap;

record Task(String title, boolean completed) {}

public class TaskManager {
	private ArrayList<Task> taskList = new ArrayList<>();
	
	private HashMap<String, Task> taskMap = new HashMap<>();
	
	public void addTask(Task task) {
		if(task.title() == null) {
			throw new IllegalArgumentException("Task title cannot be null");
		}
		taskMap.put(task.title(), task);
	}
	
	public static String taskType(Task task) {
    if (task.completed()) {
        return "Done";
    } else {
        return "Pending";
    }
}
	
	public static void main(String[] args) {
		TaskManager manager = new TaskManager();
		
		Task t1 = new Task("Buy groceries", false);
        	Task t2 = new Task("Pay bills", true);
        	Task t3 = new Task("Go to gym", false);
        	
        	manager.taskList.add(t1);
        	manager.taskList.add(t2);
        	manager.taskList.add(t3);
        	
        	 System.out.println("=== ArrayList Tasks ===");
        	for (Task t : manager.taskList) {
            System.out.println("Title: " + t.title()
                + " | Completed: " + t.completed()
                + " | Type: " + taskType(t));
                
           }     
	
	manager.addTask(t1);
     manager.addTask(t2);
     
     Task duplicate = new Task("Pay bills", false); // same title as t2
        manager.addTask(duplicate);

        System.out.println("\n=== HashMap Tasks (After Duplicate Insert) ===");
        manager.taskMap.forEach((k, v) -> {
            System.out.println("Key: " + k + " | Completed: " + v.completed());
        });
        
        System.out.println("\n=== Testing Null Title Exception ===");
        try {
            manager.addTask(new Task(null, false));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
   }     

}