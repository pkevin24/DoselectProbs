import java.math.*;
import java.util.*;
enum Speciality{
	ENGINEER,MANAGER,DEVOPS
}
class compareByName implements Comparator<Specialist1>
{

	@Override
	public int compare(Specialist1 o1,Specialist1 o2)
	{
		return o1.getName().compareTo(o2.getName());
	}


}
class Specialist1{
	private String name;
	private BigDecimal salary;
	private Speciality specialty;
	Specialist1(String name,BigDecimal salary,Speciality specialty)
	{
		this.name=name;
		this.salary=salary;
		this.specialty=specialty;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setSalary(BigDecimal salary)
	{
		this.salary=salary;
	}
	BigDecimal getSalary()
	{
		return salary;
	}
	void setSpeciality(Speciality speciality)
	{
		this.specialty=speciality;
	}
	Speciality getSpecialty()
	{
		return specialty;
	}
	public String toString()
	{
		return "Specialists{name='"+getName()+"', salary="+getSalary()+", specialty="+getSpecialty()+"}";
	}
}
class Implementation8{
	List<Specialist1>filterBySpecialty(List<Specialist1> specialists, Speciality specialty)
	{
		List<Specialist1> l=new ArrayList<>();
		for(int i=0;i<specialists.size();i++)
		{
			if(specialists.get(i).getSpecialty()==specialty)
			{
				l.add(specialists.get(i));
			}
		}
		return l;
		
	}
	List<Specialist1> sortSpecialistsByNameAsc(List<Specialist1> specialists)
	{
		Collections.sort(specialists,new compareByName());
		return specialists;
	}
}
public class Question25 {
	public static void main(String[] args)
	{
		List<Specialist1> list = Arrays.asList(
				 new Specialist1("Ivan Ivanov", new BigDecimal(5000), Speciality.ENGINEER),
				 new Specialist1("Sergey Sergeev", new BigDecimal(3000), Speciality.DEVOPS),
				 new Specialist1("Petr Petrov", new BigDecimal(10000), Speciality.MANAGER));
		Implementation8 ob=new Implementation8();
		System.out.println(ob.filterBySpecialty(list,Speciality.ENGINEER));
		System.out.println(ob.sortSpecialistsByNameAsc(list));

	}
}
