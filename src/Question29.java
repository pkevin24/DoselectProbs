import java.util.*;
class Program{
	String name;
	boolean value;
	ArrayList<String>tags;
	public Program(String name,boolean value,ArrayList<String> tags) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.value=value;
		this.tags=tags;
	}
	
}
class Menu
{
	Program prog;
	Menu(Program prog)
	{
		this.prog=prog;
	}
	String addProgram()
	{
		Character.toUpperCase(prog.name.charAt(0));
		
		if(prog.value==false)
		{
			prog.value=true;
			return "Boolean changed";
		}
		return "Program ready";
	}
	String runQuery(String query)
	{
		String a[]=query.split(",");
		int count=0;
		List<String> myList=Arrays.asList(a);
		for(int i=0;i<myList.size();i++) {
			if(!(prog.tags.contains(myList.get(i))))
			{
				count++;
			}
		}
		if(count==0)
			return "No changes";
		return count+" tag(s) added";
	}
	
}
public class Question29 {
	public static void main(String[] args) {
		Program p = new Program("reconcile program", true, new ArrayList<String>(Arrays.asList("C","D")));
		Menu m = new Menu(p);
		System.out.println(m.addProgram());
		System.out.println(m.runQuery("A,B"));

	}
}
