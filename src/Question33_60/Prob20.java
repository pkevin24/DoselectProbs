package Question33_60;
import java.util.*;
class Student12
{
	String stu_name;
	int score;
	Student12(String stu_name,int score)
	{
		
		this.stu_name=stu_name;
		this.score=score;
	}
}
class Merit
{
	HashMap<String,ArrayList<Student12>>mlist=new HashMap<>();
	String newEntry(Student12 s,String university)
	{
		if(mlist.containsKey(university))
		{
			ArrayList<Student12>a=mlist.get(university);
			a.add(s);
			mlist.remove(university);
			mlist.put(university, a);
			return "Student Added";
		}
		ArrayList<Student12>ss=new ArrayList<>();
		ss.add(s);
		mlist.put(university, ss);
		return "University Added";
	}
	ArrayList<String>getStudents(String university)
	{
		ArrayList<Student12>m=mlist.get(university);
		ArrayList<String>ss=new ArrayList<>();
		for(int i=0;i<m.size();i++)
			ss.add(m.get(i).stu_name);
		return ss;
	}
}
public class Prob20 {
	public static void main(String[] args) {
		Merit obj = new Merit();
		Student12 s1=new Student12("s1",100);
		Student12 s2=new Student12("s2",100);
		System.out.println(obj.newEntry(s1,"IIT BOMBAY"));
		System.out.println(obj.newEntry(s2,"IIT BOMBAY"));
		System.out.println(obj.getStudents("IIT BOMBAY"));
	}
}
