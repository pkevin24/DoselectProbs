import java.util.*;
enum FoodType{
	VEG,
	NONVEG
}
class sortbyAge implements Comparator<Consumer>
{

	@Override
	public int compare(Consumer c1,Consumer c2)
	{
		return c1.getAge()-c2.getAge();
	}
	
}
class Consumer{
	private String name;
    private int age;
    private FoodType foodType;
	public Consumer(String name, int age, FoodType foodType) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.foodType=foodType;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public FoodType getFoodType() {
		return foodType;
	}
	@Override
	public String toString() {
		return "Consumer [name=" + name + ", age=" + age + ", foodType=" + foodType + "]";
	}
    

}
class Implementation5{
	public List<Consumer> getNonVegetarianList(List<Consumer> consumer)
	{
		ArrayList<Consumer>a=new ArrayList<>();
		for(int i=0;i<consumer.size();i++)
		{
			if(consumer.get(i).getFoodType()==FoodType.NONVEG)
			{
				a.add(consumer.get(i));
			}
		}
		return a;
	}
	public List<Consumer> sortConsumersByAge(List<Consumer> consumer)
	{
		ArrayList<Consumer>a=new ArrayList<>();
		
		Collections.sort(consumer, new sortbyAge());
		return consumer;
	}
}
public class Question1 {
	public static void main(String[] args) {
		Implementation5 imp = new Implementation5(); 

		 Consumer p = new Consumer("Sarah", 45, FoodType.VEG);
		 Consumer p1 = new Consumer("John", 26, FoodType.NONVEG);
		 Consumer p2 = new Consumer("Mirra", 7, FoodType.NONVEG);

		List<Consumer> consumers = Arrays.asList(p, p1, p2);
		      
		System.out.println(imp.getNonVegetarianList(consumers));
		System.out.println(imp.sortConsumersByAge(consumers));

	}
}
