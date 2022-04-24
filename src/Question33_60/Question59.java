package Question33_60;
import java.util.*;
class Student2
{
	String name;
    String branch;
    int age;
    int score;
    Student2(String name,String branch,int age,int score)
    {
    	this.name=name;
    	this.branch=branch;
    	this.age=age;
    	this.score=score;
    }
}
class Company
{
	String name;
	String type;
	boolean drive;
	int cutoff;
	Company(String name, String type, int cutoff,boolean drive)
	{
		this.name=name;
		this.type=type;
		this.cutoff=cutoff;
		this.drive=drive;
	}
}
class Recruitment
{
	ArrayList<Company>companies=new ArrayList<>();
	Student2 student=null;
	@Override
	public String toString() {
		return "Recruitment [companies=" + companies + ", student=" + student + "]";
	}
	String addStudent(String name, String branch, int age, int score)
	{
		String name1=name.trim();
		String names[]=name1.split("\\s+");
		name1="";
		for(int i=0;i<names.length;i++)
			name1+=names[i]+" ";
		name1.trim();
		student.name=name1;
		List<String>branch1=new ArrayList<>();
		branch1.add("CSE");
		branch1.add("IT");
		branch1.add("ME");
		branch1.add("CE");
		branch1.add("EEE");
		branch1.add("ECE");
		if(!branch1.contains(branch))
			return "Invalid branch"	;
		student.age=age;
		student.branch=branch;
		student.score=score;
		return "Added";
	}
	String addCompany(Company company)
	{
		int ind=0;
		if(companies.contains(company))
		{
			if(company.drive)
			{
				return "Already Recruited";
			}
			for(int i=0;i<companies.size();i++)
			{
				if(company==companies.get(i))
				{
					ind=i;
				}
			}
			companies.remove(ind);
			companies.add(company);
			return "Details modified";
			
		}
		companies.add(company);
		return "Recruiting";
	}
	String eligibleCompanies(Student2 student)
	{
		String branch=student.branch;
		String s="";
		for(int i=0;i<companies.size();i++)
		{
			if(branch==companies.get(i).type)
				s+=companies.get(i).name+",";
		}
		return s;
	}
	int passedOnlineTest(int score) 
	{
		int count=0;
		for(int i=0;i<companies.size();i++)
		{
			if(companies.get(i).cutoff<score)
				count++;
		}
		return count;
	}
	int laggingScore(int value,Company c)
	{
		int diff=0;
		diff=c.cutoff-value;
		return diff;
	}
}

public class Question59 {
	public static void main(String[] args) {
		Company c1=new Company("Doselect","CSE",23,false);
		Recruitment rec=new Recruitment();
		System.out.println(rec.addCompany(c1));
		

	}
}
