class Activity{
	private String string1;
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getString2() {
		return string2;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	private String string2;
	private String operator;
	Activity(String string1,String string2,String operator)
	{
		this.string1=string1;
		this.string2=string2;
		this.operator=operator;
	}
}
class Source
{
	public String validity(Activity a) throws Exception
	{
		if((a.getString1().isEmpty() || a.getString2().isEmpty()))
		{
			throw new NullPointerException("Null values found");
		}
		if(!(a.getOperator()=="+" || a.getOperator()=="-"))
			throw new Exception();
		return "No Exception Found";
		
	}
	public String handleException(Activity a)
	{
		try {
			validity(a);
				
		}
		catch(NullPointerException e) {
			return "Null values found";
		}	
		catch(Exception e)
		{
			return a.getOperator();
		}
		return "No Exception Found";
	}
	public String operate(Activity a)
	{
		int ele1=Integer.valueOf(a.getString1());
		int ele2=Integer.valueOf(a.getString2());
		double sol;
		switch(a.getOperator())
		{
		case "+": sol=ele1+ele2;
			break;
		case "-":sol=ele1-ele2;
			break;
		case "/":sol=(double)ele1/(double)ele2;
			break;
		default:sol=0;
			break;
		}
		return Double.toString(sol);
	}
}
class NullPointerException extends Exception
{
	NullPointerException(String s)
	{
		super(s);
	}
}
public class Question13 {
	public static void main(String[] args) {
		Activity a=new Activity("2","3","+");
		Source s=new Source();
		System.out.println(s.handleException(a));
		System.out.println(s.operate(a));
	}
}
