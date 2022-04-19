import java.util.*;
class sortbyname implements Comparator<Customer2>
{

	@Override
	public int compare(Customer2 o1, Customer2 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
class Customer2{
	private String name;
	private int age;
	Customer2(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	@Override
	public String toString() {
		return "Customer2 [name=" + name + ", age=" + age + "]";
	}
	
//	public String toString()
//	{
//		"";
//	}
}
class Implementation3{
	List<Customer2>sortCustomerList(List<Customer2> customersList)
	{
		Collections.sort(customersList, new sortbyname());
		return customersList;
	}
	public String withDelimeters(List<Customer2> customersList)
	{
		String s="";
		for(int i=0;i<customersList.size()-1;i++)
		{
			s+="Customer{name='"+customersList.get(i).getName()+"',age="+customersList.get(i).getAge()+"}@";
		}
		s+="Customer{name="+customersList.get(customersList.size()-1).getName()+"',age="+customersList.get(customersList.size()-1).getAge()+"}";
		return s;
	}
}
public class Question27 {
	public static void main(String[] args) {
		List<Customer2> customersList = Arrays.asList(
				 new Customer2("Tom", 30),
				 new Customer2("Steve", 31),
				 new Customer2("Peter", 34),
				 new Customer2("Simon", 23));
		Implementation3 im=new Implementation3();
		System.out.println(im.withDelimeters(customersList));
		System.out.println(im.sortCustomerList(customersList));

	}
}
