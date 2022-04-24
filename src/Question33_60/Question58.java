package Question33_60;
import java.util.*;
class Laptop1
{
	String name;
	String model;
	String date;
	Laptop1(String name,String model,String date)
	{
		this.name=name;
		this.model=model;
		this.date=date;
	}
}
class Purchase
{
	Laptop1 laptop;
	String purchaseLaptop(String name,String model,String date)
	{
		List<String>l1=new ArrayList<>();
		List<String>l2=new ArrayList<>();
		String special="! @ # $ % ^ & * ( ) ~ ` + - _ , . / < > ? ; ' : [ ] { } |";
		String specialCharcter[]=special.split(" ");
		l1=Arrays.asList(specialCharcter);
		List<String>Companyname=new ArrayList<>();
		Companyname.add("Dell");
		Companyname.add("Acer");
		Companyname.add("HP");
		List<String>Processor=new ArrayList<>();
		Processor.add("Single");
		Processor.add("Double");
		Processor.add("Quad");
		Processor.add("Octa");
		String names[]=name.split(" ");
		if(!Companyname.contains(names[0]))
		{
			return "Invalid brand name";
		}
		if(!Processor.contains(names[1]))
			return "Invalid processor";
		int uppercaselet=0;
		int lowercaselet=0;
		int specialcharacters=0;
		int digits=0;
		for(int i=0;i<model.length();i++)
		{
			if(Character.isUpperCase(model.charAt(i)))
				uppercaselet++;
			if(Character.isLowerCase(model.charAt(i)))
				lowercaselet++;
			if(l1.contains(model.charAt(i)))
				specialcharacters++;
			if(Character.isDigit(model.charAt(i)))
				digits++;
		}
		if(!(model.length()==9 && uppercaselet==3 && lowercaselet==3 && digits==2 && specialcharacters==2))
			return "Invalid model number";
		laptop.model=model;
		laptop.date=date;
		laptop.name=name;
		return "Laptop purchased";
	}
	String findGeneration(String processor)
	{
		if(processor=="Octa")
			return "Gen 11";
		if(processor=="Quad 10")
			return "Gen 10";
		if(processor=="Double")
			return "Gen 9";
		return "Lower than 9";
	}
}
public class Question58 {
	public static void main(String[] args) {
		Laptop1 l=new Laptop1("Acer Quad","@#","12/12/2018");
		Purchase p=new Purchase();
		System.out.println(p.purchaseLaptop("Dell Quad","@#","12/12/2018"));

	}
}
