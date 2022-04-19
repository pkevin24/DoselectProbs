package Question33_60;

import java.time.LocalDate;
import java.util.*;
class Person{
	private int id;
	private String name;
	private LocalDate birthDate;
	Person(int id,String name,LocalDate birthDate)
	{
		this.id=id;
		this.name=name;
		this.birthDate=birthDate;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
}
class CompareDate implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getBirthDate().compareTo(o2.getBirthDate());
	}
	
}
class Implementation{
	List<Person> filterListByBirth(List<Person> persons)
	{
		Collections.sort(persons, new CompareDate());
		return persons;
	}
	List<Person> limitSkipAndReturn(List<Person> persons, int pageNumber, int pageSize) 
	{
		List<Person>p=new ArrayList<>();
		int n=pageNumber*pageSize;
		int count=0;
		for(int i=0;i<persons.size();i++)
		{
			if(count!=2)
			{
				p.add(persons.get(i));
				i+=n+1;
				count++;
			}
		}
		return p;
	}
}
public class Question33 {
	public static void main(String[] args) {
		Person p1 = new Person(1, "Mito", LocalDate.of(1991, 1, 21));
		 Person p2 = new Person(2, "Code", LocalDate.of(1990, 2, 21));
		 Person p3 = new Person(3, "Jaime", LocalDate.of(1980, 6, 23));
		 Person p4 = new Person(4, "Duke", LocalDate.of(2019, 5, 15));
		 Person p5 = new Person(5, "James", LocalDate.of(2010, 1, 4));

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
//		------------------------------------------------------
		Implementation imp=new Implementation();
		System.out.println(imp.filterListByBirth(persons));
		System.out.println(imp.limitSkipAndReturn(persons, 1, 2));

	}
}
