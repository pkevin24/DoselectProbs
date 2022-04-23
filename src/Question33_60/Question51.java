package Question33_60;
class User
{
	private String name;
	private String city;
	private String state;
	private String pincode;
	private String dob;
	User(String name,String city,String state,String pincode,String dob)
	{
		this.name=name;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
		this.dob=dob;
	}
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getCity()
	{
		return city;
	}
	void setCity(String city)
	{
		this.city=city;
	}
	String getState()
	{
		return state;
	}
	void setState(String state)
	{
		this.state=state;
	}
	String getPincode()
	{
		return pincode;
	}
	void setPincode(String pincode)
	{
		this.pincode=pincode;
	}
	String getDob()
	{
		return dob;
	}
	void setDob(String dob)
	{
		this.dob=dob;
	}
	
}
class EmployeeID
{
	User user;
	public EmployeeID(User user) {
		this.user=user;
	}
	String generateId()
	{
		if(!pincodeValidator())
			return "NA";
		if(pincodeValidator() && dobValidator())
		{
			String s=user.getName().substring(0,3)+user.getCity().charAt(0)+user.getCity().charAt(0)+user.getDob().substring(0,2);
			return s;
		}
		return user.getName().substring(0,3)+user.getCity().charAt(0)+user.getCity().charAt(0);
	}
	boolean pincodeValidator()
	{
		String pin=user.getPincode();
		for(int i=0;i<pin.length();i++)
		{
			if(!Character.isDigit(pin.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
	boolean dobValidator()
	{
		String dob[]=user.getDob().split("/");
		boolean slash=false;
		if(dob.length-1==2)
			slash=true;
		int count=0;
		for(int i=0;i<dob.length;i++)
		{
			count+=dob[i].length();
		}
		if((count==8)&& slash)
			return true;
		return false;
	}
}
public class Question51 {
	public static void main(String[] args) {
		User user = new User("doselect","d","delhi","400001","22/04/2002");
		EmployeeID employeeID = new EmployeeID(user);
		System.out.println(employeeID.generateId());
		
		
	}
}
