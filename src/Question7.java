class Person{
	String name;
	String dateOfBirth;
	String email;
	Person(String name,String dateOfBirth,String email)
	{
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.email=email;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth=dateOfBirth;
	}
	String getDateOfBirth()
	{
		return dateOfBirth;
	}
	void setEmail(String email)
	{
		this.email=email;
	}
	String getEmail()
	{
		return email;
	}
	
}
class Implementation2{
	String validator(Person details) throws InvalidDateException,InvalidEmailException
	{
		String s[]=details.getDateOfBirth().split("-");
		int year=Integer.valueOf(s[2]);
		if(year>=2000)
		{
			throw new InvalidDateException("date year must be less than 2000");
		}
//		String s1[]=details.getEmail().split("@doselect.com");
		String s1="@doselect.com";
		if(!(details.getEmail().contains(s1)))
		{
			throw new InvalidEmailException("only @doselect.com domain email are accepted");
		}
		return "valid details";
	}
	String submitDetails(Person details) throws InvalidEmailException
	{
		try {
			validator(details);
		}
		catch( InvalidDateException e)
		{
			return "invalid details";
		}
		catch(InvalidEmailException e1)
		{
			return "invalid details";
		}
		catch(Exception e)
		{
			return "other exception";
		}
		return "details submitted successfully";
		
	}
	
}
class InvalidEmailException extends Exception{
	InvalidEmailException(String s)
	{
		super(s);
	}
}
class InvalidDateException extends Exception{
	InvalidDateException(String s)
	{
		super(s);
	}
}
public class Question7 {
	public static void main(String[] args) throws InvalidDateException,InvalidEmailException
	{
		Person data = new Person("Steve", "12-02-1998", "Steve12@doselect.com");
		Implementation2 obj = new Implementation2();
		String s1=obj.validator(data);
		String s2=obj.submitDetails(data);
	
		System.out.println(s1);
		System.out.println(s2);

	}
}
