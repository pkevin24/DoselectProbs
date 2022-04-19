class Vehicle{
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel_no() {
		return model_no;
	}
	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getOwner_details() {
		return owner_details;
	}
	public void setOwner_details(String owner_details) {
		this.owner_details = owner_details;
	}
	private String model_no;
	private String model_name;
	private String owner_name;
	private String owner_details;
	Vehicle(String model_no,String model_name, String owner_name,String owner_details)
	{
		this.model_no=model_no;
		this.model_name=model_name;
		this.owner_name=owner_name;
		this.owner_details=owner_details;
	}
	Vehicle()
	{
		
	}
	String get_type()
	{
		return type;
	}
	String retrieve() throws TypeException
	{
		return "null";
	}
}
class TypeException extends Exception
{
	@Override
	public String toString()
	{
		return "Vehicle Type Not Set";
	}
	
}
class Car extends Vehicle{
	private String type;
	Car(String type,String model_no,String model_name, String owner_name,String owner_details)
	{
		super(model_no,model_name,owner_name,owner_details);
		this.type=type;
	}
	Car(){};
	public String getType()
	{
		return type;
	}
	public void setType()
	{
		this.type=type;
	}
	@Override
	public String toString() {
		
		return "Car [type=" + type + ", getModel_no()=" + getModel_no() + ", getModel_name()=" + getModel_name()
				+ ", getOwner_name()=" + getOwner_name() + ", getOwner_details()=" + getOwner_details()
				+ "]";
	}
	String retrieve() throws TypeException
	{
		if(get_type()==null)
		{
			throw new TypeException();
		}
//		String s=get_type()+getModel_name();
		return toString();
	}
}
public class Question15 {
	public static void main(String[] args) throws TypeException {
		Car c=new Car(null,"zxi","i10","Prince","963299505");
		System.out.println(c.retrieve());
	}
}
