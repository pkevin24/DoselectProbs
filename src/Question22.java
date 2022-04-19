import java.util.*;
class Dance{
	HashMap<String,Integer> steps=new HashMap<>();
	public String newStep(String name, int ways)
	{
		if(steps.containsKey(name)==true)
		{
			steps.replace(name, ways);
			return "Stepped in"; 
		}
		steps.put(name, ways);
		return "New step";
		
	}
	public int findStep(String name)
	{
		if(steps.containsKey(name))
		{
			return steps.get(name);
		}
		return 0;
	}
}
public class Question22 {
	public static void main(String[] args) {
		Dance obj = new Dance();
		String s1=obj.newStep("Step1",9);
		String s2=obj.newStep("Step1",11);
		System.out.println(s2);
		System.out.println(obj.findStep("Step1"));
	}
}
