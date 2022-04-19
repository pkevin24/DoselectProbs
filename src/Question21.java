import java.util.*;
class Car1{
	public int carId;
	public int speed;
	Car1(int carId,int speed)
	{
		this.carId=carId;
		this.speed=speed;
	}
}
class CarRacing{
	ArrayList<Car1> cars = new ArrayList<>();
	int trackCount;
	CarRacing(int trackCount)
	{
		this.trackCount=trackCount;
	}
	public String carEntry(Car1 car)
	{
		if(trackCount==cars.size())
			return "No space";
		for(int i=0;i<cars.size();i++)
		{
			if(cars.get(i).carId==car.carId)
			{
				return "Already exists";
			}
		}
		return "Start practicing";
	}
	public int getWinner(int trackLength)
	{
		if(cars.size()==0)
			return -1;
		int time=trackLength*cars.get(0).speed;
		int ind=0;
		for(int i=1;i<cars.size();i++)
		{
			if(time<trackLength*cars.get(i).speed)
			{
				time=trackLength*cars.get(i).speed;
				ind=i;
			}
		}
		return cars.get(ind).carId;
	}
}
public class Question21 {
	public static void main(String[] args) {
		Car1 car = new Car1(1,100);
		CarRacing carRacing = new CarRacing(2);
		System.out.println(carRacing.carEntry(car));

	}
}
