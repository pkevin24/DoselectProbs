package Question33_60;
class Register{
	String checkCredentials(String email,String pass,String cpass) throws InvalidEmailException,InvalidPasswordException,PasswordNotMatchException 
	{
		String checkat[]=email.split("@");
		String dom=checkat[1];
		String checkdot[]=dom.split(".");
//		if(!(email.contains("@") && email.contains(".")))
		if(!(email.contains("@") && email.contains(".")))
		{
			throw new InvalidEmailException("Invalid Email");
		}
		if(pass.length()<6)
			throw new InvalidPasswordException("Invalid Password"); 
		if(!pass.equals(cpass))
			throw new PasswordNotMatchException("Password not match");
		return "Registered";
	}
}
class InvalidEmailException extends Exception
{
	InvalidEmailException(String s)
	{
		super(s);
	}
}
class InvalidPasswordException extends Exception
{
	InvalidPasswordException(String s)
	{
		super(s);
	}
}
class PasswordNotMatchException  extends Exception
{
	PasswordNotMatchException(String s)
	{
		super(s);
	}
}
public class Question46 {
	public static void main(String[] args) throws InvalidEmailException,InvalidPasswordException,PasswordNotMatchException {
		Register user = new Register();
		System.out.println(user.checkCredentials("tushar@gmailcom","hiiiiii","hiiiiii"));

	}
}
