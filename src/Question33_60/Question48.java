package Question33_60;
class RacingCar{
	int speed;
	int distance;
	int petrolRate;
	RacingCar(int speed,int distance,int petrolRate)
	{
		this.speed=speed;
		this.distance=distance;
		this.petrolRate=petrolRate;
	}
	int validateCar(int time) throws LowSpeedException,HighSpeedException
	{
		int t=(int)Math.ceil(distance/speed);
		if(t>time)
			throw new LowSpeedException("Upgrade car");
		if(t<time)
			throw new HighSpeedException("Accident Chances");
		return calculateprice();
	}
	int calculateprice() 
	{
		return (int)Math.ceil(distance/petrolRate);
	}
}
class LowSpeedException extends Exception
{
	LowSpeedException(String s)
	{
		super(s);
	}
}
class HighSpeedException extends Exception
{
	HighSpeedException(String s)
	{
		super(s);
	}
}
public class Question48 {
	public static void main(String[] args) throws LowSpeedException,HighSpeedException {
		RacingCar car = new RacingCar(100,1000,11);
		

		System.out.println(car.validateCar(50));
	}
}
