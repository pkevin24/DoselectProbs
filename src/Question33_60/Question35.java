package Question33_60;
import java.util.*;
class Task{
	String name;
	int hours;
	Task(String name,int hours)
	{
		this.name=name;
		this.hours=hours;
	}
	
}
class ToDoList{
	private List<Task> tasks=new ArrayList<>();
	String addTask(Task t) throws TaskException
	{
			
		if(t.hours<1 || t.hours>24)
			throw new TaskException("Invalid time");
		if(tasks==null) {
			tasks.add(t);
			return "Task will be completed";
	}
		if(tasks.contains(t))
			throw new TaskException("Already present");
		tasks.add(t);
		return "Task will be completed";
	}
	String completeTask(Task t)
	{
		try {
			addTask(t);
		}
		catch(TaskException e)
		{
			return "Task incomplete";
		}
		catch(Exception e)
		{
			return "Other exception";
		}
		return "Task Completed";
	}
}
class TaskException extends Exception{
	TaskException(String s)
	{
		super(s);
	}
}
public class Question35 {
	public static void main(String[] args) throws TaskException
	{
		Task t= new Task("Gym",12);
		ToDoList lst=new ToDoList();
		String t1=lst.addTask(t);
		System.out.println(t1);
		
		
		
		
				
	}
}
