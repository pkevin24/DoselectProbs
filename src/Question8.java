class Customer{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	String mobileNo;
	String cId;
	Customer(String name,String mobileNo,String cId)
	{
		this.name=name;
		this.mobileNo=mobileNo;
		this.cId=cId;
	}
	
}
class InvalidCIdException extends Exception
{
	InvalidCIdException(String s)
	{
		super(s);
	}
}
class Validator2{
	String validateCId(Customer c) throws InvalidCIdException1
	{
		String name=c.getName();
		String phone=c.getMobileNo();
		String cld1="";
		int namelen=name.length()-1;
		cld1+=phone.substring(0, 4)+name.substring(namelen-1);
//		System.out.println(cld1);
		if(!(cld1.equals(c.getcId())))
		{
			throw new InvalidCIdException1("Invalid CId");
		}
		return "Valid CId";
		
	}
	String validateMobileNo(Customer c) throws InvalidMobileNoException
	{
		String number=c.getMobileNo();
		int len=number.length();
		char ind0=number.charAt(0);
		if(len==10 && (ind0=='9' || ind0=='8'|| ind0=='7' ||ind0=='6' ))
		{
			return "Valid MobileNo";
		}
		throw new InvalidMobileNoException("Invalid MobileNo");
	}
}
class InvalidMobileNoException extends Exception
{
	InvalidMobileNoException(String s)
	{
		super(s);
	}
}

class InvalidCIdException1 extends Exception
{
	InvalidCIdException1(String s)
	{
		super(s);
	}
}

public class Question8 {
	public static void main(String[] args) throws InvalidCIdException1, InvalidMobileNoException {
		Customer obj = new Customer("Steve","9898111111","9898ve");
		Validator2 val = new Validator2();
		String CID = val.validateCId(obj);
		String mob = val.validateMobileNo(obj);
		System.out.println("CID="+CID);
		System.out.println("mob="+mob);

	}
}
