package Question33_60;
import java.util.*;
class Customer2{
	String name;
	int numberOfRooms;
	Customer2(String name,int numberOfRooms)
	{
		this.name=name;
		this.numberOfRooms=numberOfRooms;
	}
	
}
class Hotel
{
	List<String> customerName=new ArrayList<>();
	int roomsBooked=0;
	public String checkIn(Customer2 customer)
	{
		int n=customer.numberOfRooms;
		if(n+roomsBooked<=10)
		{
			customerName.add(customer.name);
			roomsBooked+=n;
			return "Checked in";
		}
		return "No rooms available";
	}
	public String checkRooms(Customer2 customer)
	{
		if(customerName.contains(customer.name))
		{
			return "yes";
		}
		return "no";
	}
}
public class Question47 {
	public static void main(String[] args) {
		Customer2 cust=new Customer2("Doselect", 4);
		Hotel hotel=new Hotel();
		System.out.println(hotel.checkIn(cust));

	}
}
