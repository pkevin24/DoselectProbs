import java.util.*;
class Product2{
	private int id;
	private String name;
	private Double price;
	Product2(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
class Implementation7{
	Map<String,List<Product2>> getProductName(List<Product2> products)
	{
		HashMap<String,List<Product2>> hm=new HashMap<>();
		List<Product2>l=new ArrayList<>();
		for(int i=0;i<products.size();i++)
		{
			l.add(products.get(i));
			List<Product2>l1=new ArrayList<>();
			l1.add(l.get(i));
			hm.put(products.get(i).getName(),l1);
		}
		return hm;
	}
	Map<String,Double> getSum(List<Product2> products) 
	{
		HashMap<String,Double>hm=new HashMap<>();
		ArrayList<String>a=new ArrayList<>();
		for(int i=0;i<products.size();i++)
		{
			a.add(products.get(i).getName());
		}
		
		for(int i=0;i<products.size();i++)
		{
			double sum=0;
			for(int j=0;j<products.size();j++)
			{
				if(a.get(i)==products.get(j).getName())
				{
					sum+=products.get(j).getPrice();
				}
			}
			hm.put(products.get(i).getName(), sum);
		}
		return hm;
	}
}
public class Question32 {
	public static void main(String[] args) {
		Product2 pr1 = new Product2(1, "Ceviche", 15.0);
		Product2 pr2 = new Product2(2, "Chilaquiles", 25.50);
		Product2 pr3 = new Product2(3, "Bandeja Paisa", 35.50);
		Product2 pr4 = new Product2(4, "Ceviche", 15.0);
		Product2 pr5 = new Product2(4, "Ceviche", 15.0);
		List<Product2> pr = Arrays.asList(pr1, pr2, pr3,pr5,pr4);
		Implementation7 imp = new Implementation7();
//		------------------------------------------------------

		System.out.println(imp.getProductName(pr));
		System.out.println(imp.getSum(pr));

	}
}
