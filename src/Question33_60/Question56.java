package Question33_60;
import java.util.*;
class Implementation1
{
	int count(List<String>products)
	{
		return products.size();
	}
	String match(List<String>products)
	{
		boolean ma=false;
		for(int i=0;i<products.size();i++)
		{
			String a=products.get(i).toLowerCase();
			if(a.contains("z")) {
				ma=true;
			}
		}
		if(ma)
			return "Cant fool the system, that sentence contain z";
		return "Great Job that sentence does not contain z";
	}
	
}
public class Question56 {
	public static void main(String[] args)
	{
		Implementation1 i = new Implementation1(); 
		List<String> list = new ArrayList<String>(); 
		list.add("Gadgets"); 
		list.add("FoodItem"); 
		list.add("Pets"); 
		list.add("Appliances");
		System.out.println(i.count(list));
		System.out.println(i.match(list));
	}
}
