class Credentials{
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	Credentials(String userName, String password)
	{
		this.userName=userName;
		this.password=password;
	}
	
}
class Implementation{
	String passwordValidator(Credentials details) throws MissingCharacterException ,LengthMismatchException
	{
		String s=details.getPassword();
		boolean uppercase=false;
		boolean lowercase=false;
		boolean digit=false;
		boolean specialchar=false;
		for(int i=0;i<s.length();i++)
		{
			char t=s.charAt(i);
			
			if(Character.isUpperCase(t))
			{
				uppercase=true;
			}
			if(Character.isLowerCase(t))
			{
				lowercase=true;
			}
			if(Character.isDigit(t))
			{
				digit=true;
			}
			int s1=t;
			if(s1>32 && s1<72)
			{
				specialchar=true;
			}
		}
		if(!(lowercase && uppercase && specialchar && digit))
		{
			throw new MissingCharacterException("password must contain at least one special character, at least one upper case alphabet, at least one lower case alphabet, and at least one digit");
		}
		if(s.length()<8 && s.length()>40)
		{
			throw new LengthMismatchException("length of the password is not between 8 to 40");
		}
		return "valid password";
	}
	String signUp(Credentials details)
	{
		try {
			passwordValidator(details);
		}
		catch(MissingCharacterException e)
		{
			return "invalid password";
		}
		catch(LengthMismatchException e1)
		{
			return "invalid password";
		}
		catch(Exception e)
		{
			return "other exception";
		}
		return "signup successfully";
	}
}
class  MissingCharacterException extends Exception{
	public MissingCharacterException(String s) {
		super(s);
	}
}
class LengthMismatchException extends Exception{
	public LengthMismatchException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
public class Question6 {
	public static void main(String[] args) throws MissingCharacterException, LengthMismatchException {
		Implementation obj = new Implementation();
		String s1=obj.passwordValidator(new Credentials("Steve", "Akjsdhhj@1"));
		String s2=obj.signUp(new Credentials("Bob", "jsdhJS12*&$1"));
		System.out.println(s1);
		System.out.println(s2);
	}
}
