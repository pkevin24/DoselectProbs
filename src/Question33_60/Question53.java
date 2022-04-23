package Question33_60;
import java.util.*;
class Dish
{
	private String dishName;
	Dish(String dishName)
	{
		this.dishName=dishName;
	}
	void setDishName(String dishName)
	{
		this.dishName=dishName;
	}
	String getDishName()
	{
		return dishName;
	}
	public String toString()
	{
		return "Dish{dishName='"+getDishName()+"'}";
	}
	
}
class DishTest
{
	List<Dish>addYummyToName(List<Dish>list)
	{
		List<Dish>d=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			String dname=list.get(i).getDishName();
			dname="Yummy: "+dname;
			list.get(i).setDishName(dname);
			d.add(list.get(i));
		}
		return d;
		
	}
	Long count(List<Dish>list,String s)
	{
		long count=0;
		char ch=s.charAt(0);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getDishName().startsWith(s))
				count++;
		}
		return count;
	}
}
public class Question53 {
	public static void main(String[] args) {
		DishTest dt = new DishTest();
		 List<Dish> list = new ArrayList<Dish>();
		  list.add(new Dish("Gazpacho"));
		  list.add(new Dish("Jamon"));
		  list.add(new Dish("Tortilla"));
		  list.add(new Dish("Churros"));
//		  list.add(new Dish("Samosa"));
		  System.out.println(dt.addYummyToName(list));
		  System.out.println(dt.count(list, "S"));
	}
}
