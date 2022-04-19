import java.util.*;
class Product{
	private Integer id;
	private String name;
	private double price;
	Product(Integer id, String name, Double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
class Implementation4{
	Map<String,List<Product>> getProductName(List<Product> products)
	{
		Map<String,List<Product>> m=new HashMap<>();
		ArrayList<Product>a=new ArrayList<>();
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getPrice()>20)
			{
				a.add(products.get(i));
				m.put(products.get(i).getName(),a);
			}
		}
		return m;
	}
	Map<String, Double>  getSum(List<Product> products)
	{
		Map<String,Double> m=new HashMap<>();
		for(int i=0;i<products.size();i++)
		{
			m.put(products.get(i).getName(), products.get(i).getPrice());
		}
		return m;
	}
}
public class Question28 {
	public static void main(String[] args) {
		Product pr5 = new Product(1, "Bruchotte", 5.0);
		Product pr6 = new Product(4, "Banana", 1305.0);

		List<Product> pr= Arrays.asList(pr5, pr6);
		Implementation4 im=new Implementation4();
		System.out.println(im.getProductName(pr));
		System.out.println(im.getSum(pr));
	}
}
