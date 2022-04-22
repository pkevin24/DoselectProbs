package Question33_60;
import java.util.*;
class Email{
	String username;
	String domain;
	Email(String username,String domain)
	{
		this.username=username;
		this.domain=domain;
	}
}
class Validator{
	String checkEmail(Email email) throws EmailException
	{
		for(int i=0;i<email.username.length();i++)
		{
			if(!(Character.isAlphabetic(email.username.charAt(i)) || Character.isDigit(email.username.charAt(i)) ||email.username.charAt(i)=='@'))
			{
				throw new EmailException("Invalid username");
			}	
		}
		ArrayList<String>dom=new ArrayList<>();
		dom.add("outlook");
		dom.add("gmail");
		dom.add("hotmail");
		dom.add("godaddy");
		if(!dom.contains(email.domain))
			throw new EmailException("Invalid domain");
		return "Continue";
	}
	String signIn(Email email)
	{
		try {
			checkEmail(email);
		}
		catch(EmailException e)
		{
			return "Failed";
		}
		return "Signed in";
	}
}
class EmailException extends Exception{
	EmailException(String s)
	{
		super(s);
	}
}
public class Question40 {
	public static void main(String[] args) throws EmailException{
		Email e=new Email("Shoyab@","gmail");
		Validator v = new Validator();
		String s = v.checkEmail(e);
		String t = v.signIn(e);
		s.toLowerCase();
		 t.toLowerCase();
		 System.out.println(s);
		 System.out.println(t);

	}
}
