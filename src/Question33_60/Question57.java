package Question33_60;
import java.util.*;
class Lecturer
{
	private String lecturerFirstName;
	private String lecturerLastName;
	private int salary;
	public String getLecturerFirstName() {
		return lecturerFirstName;
	}
	public void setLecturerFirstName(String lecturerFirstName) {
		this.lecturerFirstName = lecturerFirstName;
	}
	public String getLecturerLastName() {
		return lecturerLastName;
	}
	public void setLecturerLastName(String lecturerLastName) {
		this.lecturerLastName = lecturerLastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	Lecturer(String lecturerFirstName,String lecturerLastName,int salary)
	{
		this.lecturerFirstName=lecturerFirstName;
		this.lecturerLastName=lecturerLastName;
		this.salary=salary;
	}
	public String toString()
	{
		return "Lecturer{lecturerFirstName='"+getLecturerFirstName()+"', lecturerLastName='"+getLecturerLastName()+"', salary="+getSalary()+"}";
	}

}
class Implementation2
{
	List<String>getFirstName(List<Lecturer> list)
	{
		List<String>names=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			names.add(list.get(i).getLecturerFirstName());
		}
		return names;
	}
	double getMaxSalary(List<Lecturer> lecturerList)
	{
		int maxsal=lecturerList.get(0).getSalary();
		for(int i=1;i<lecturerList.size();i++)
		{
			if(maxsal<lecturerList.get(i).getSalary())
			{
				maxsal=lecturerList.get(i).getSalary();
			}
		}
		return (double)maxsal;
	}
}
public class Question57 {
	public static void main(String[] args) {
		Implementation2 i = new Implementation2();
		 List<Lecturer> list = new ArrayList<Lecturer>();
		  list.add(new Lecturer("Alan", "D'costa", 500000));
		  list.add(new Lecturer("Tom", "Sal", 1000000));
		  list.add(new Lecturer("John", "Mirra", 360000));
		  System.out.println(i.getFirstName(list));
		  System.out.println(i.getMaxSalary(list));
		  


	}
}
