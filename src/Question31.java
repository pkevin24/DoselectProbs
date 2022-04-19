import java.util.*;
class Dog{
	String name;
	int age;
	int weight;
	Dog(String name,int age,int weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	void setWeight(int weight)
	{
		this.weight=weight;
	}
	public int getWeight()
	{
		return weight;
	}
	public String toString()
	{
		return "Dog{name='"+getName()+"',age="+getAge()+", weight="+getWeight()+"}";
	}
}
class Implementation6
{
	List<Dog>filterByAgeAndWeight(List<Dog> listDog)
	{
		ArrayList<Dog>a=new ArrayList<>();
		for(int i=0;i<listDog.size();i++)
		{
			if(listDog.get(i).getAge()>10 && listDog.get(i).getWeight()>25)
			{
				a.add(listDog.get(i));
			}
		}
		return a;
	}
	String separateWithDelimeter(List<Dog> listDog) {
		String s="";
		for(int i=0;i<listDog.size()-1;i++)
		{
			s+="Dog{name='"+listDog.get(i).getName()+"',age="+listDog.get(i).getAge()+", weight="+listDog.get(i).getWeight()+"}"+"$~$~";
		}
		s+="Dog{name='"+listDog.get(listDog.size()-1).getName()+"',age="+listDog.get(listDog.size()-1).getAge()+", weight="+listDog.get(listDog.size()-1).getWeight()+"}";
		
		return s;
	}
}
public class Question31 {
	public static void main(String[] args) {
		List<Dog> list = new ArrayList<Dog>();
		  list.add(new Dog("German Shepherd ", 20, 35));
		  list.add(new Dog("Labrador ", 5, 40));
		  list.add(new Dog("Pitbull ", 29, 100));
		  list.add(new Dog("Poodle", 10, 45));
		  Implementation6 im=new Implementation6();
		  System.out.println(im.filterByAgeAndWeight(list));
		  System.out.println(im.separateWithDelimeter(list));
	}
}
