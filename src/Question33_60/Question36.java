package Question33_60;
import java.util.*;
class Student{
	private String name;
	private int roll;
	Student(String name, int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
}
class Record{
	List<Student> students=new ArrayList<>();
	String addStudent(Student student)
	{
		String name=student.getName();
		boolean cha=true;
		for(int i=0;i<name.length();i++)
		{
			if(!Character.isAlphabetic(name.charAt(i)))
			{
				cha=false;
			}
		}
		if(cha)
		{
			students.add(student);
			return "Added";
		}
		return "Invalid name";
	}
	String swapRolls(Student s1, Student s2)
	{
		int rno1,rno2;
		rno1=s1.getRoll();
		rno2=s2.getRoll();
		s1.setRoll(rno2);
		s2.setRoll(rno1);
		return "Swapped";
	}
}
public class Question36 {
	public static void main(String[] args) {
		Student s1=new Student("A",1);
		Student s2=new Student("B",2);
		Record record = new Record();
		System.out.println(record.addStudent(s1));
		System.out.println(record.addStudent(s2));
		System.out.println("Before swap");
		System.out.println(s1.getRoll());
		System.out.println(s2.getRoll());
		System.out.println(record.swapRolls(s1, s2));
		System.out.println("After swap");
		System.out.println(s1.getRoll());
		System.out.println(s2.getRoll());
	}
}
