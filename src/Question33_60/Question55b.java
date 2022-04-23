package Question33_60;
import java.util.*;
class Student11
{
	String name;
	int score;
	Student11(String name,int score)
	{
		this.name=name;
		this.score=score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String toString()
	{
		return "Student{name='"+getName()+"', score='"+getScore()+"'}";
	}
}
class ReportCard
{
	List<String>mapStudentName(List<Student11>list)
	{
		List<String>names=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			names.add(list.get(i).getName());
		}
		return names;
	}
	List<Student11>scoreQuery(List<Student11> list)
	{
		List<Student11>l=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getScore()>40 && list.get(i).getScore()<100)
			{
				l.add(list.get(i));
			}
		}
		return l;
	}
}
public class Question55b {
	public static void main(String[] args) {
		ReportCard r = new ReportCard();
		 List<Student11> list = new ArrayList<Student11>();
		  list.add(new Student11("Sarah", 70));
		  list.add(new Student11("John", 99));
		  list.add(new Student11("Jenny", 39));
		  list.add(new Student11("Harry", 22));
//		---------------------------------------------------------
		 System.out.println(r.mapStudentName(list));
		 System.out.println(r.scoreQuery(list));

	}
}
