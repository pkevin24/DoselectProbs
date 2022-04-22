package Question33_60;
class Student1
{
	String name;
	int score;
	Student1(String name,int score)
	{
		this.name=name;
		this.score=score;
	}
}
class Classroom
{
	String registerStudent(Student1 student)
	{
		for(int i=0;i<student.name.length();i++)
		{
			if(!Character.isUpperCase(student.name.charAt(i)))
			{
				return "Block letters needed";
			}
		}
		if(!(student.score>=0 && student.score<=100))
		{
			return "Invalid score";
		}
		return "Registered";
	}
	String studentCard(String card)
	{
		for(int i=0;i<card.length();i++)
		{
			char ch=card.charAt(i);
			if(!Character.isDigit(ch))
			{
				return "Invalid card";
			}
		}
		return "valid card";
	}
}
public class Question39 {
	public static void main(String[] args) {
		Student1 s1=new Student1("A",6);
		 Classroom cm=new Classroom();
		 System.out.println(cm.registerStudent(s1));
		 System.out.println(cm.studentCard("123"));

	}
}
