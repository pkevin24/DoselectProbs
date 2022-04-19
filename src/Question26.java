import java.util.*;
class compareto implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}
class Member
{	
	public List<String> match(List<String> memberNames)
	{
		List<String>memberNames1=new ArrayList<>();
		Collections.sort(memberNames,new compareto());
		for(int i=0;i<memberNames.size();i++)
		{
			memberNames1.add(memberNames.get(i).toUpperCase());
		}
		return memberNames1;
		
		
	}
	public long countA(List<String> memberNames)
	{
		long val=0;
		for(int i=0;i<memberNames.size();i++)
		{
			if(memberNames.get(i).charAt(0)=='A')
			{
				val++;
			}
			
		}
		return val;
	}
}
public class Question26 {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>(Arrays.asList("Amitabh", "Shekhar", "Aman", "Rahul",
		        "Shahrukh", "Salman", "Yana", "Lokesh"));
		Member m=new Member();
		System.out.println(m.countA(memberNames));
		System.out.println(m.match(memberNames));
	}
}
