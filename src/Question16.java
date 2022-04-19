
class Customer3{
	int id;
	String name;
	double walletBalance;
	String address;
	public Customer3(int id,String name,double walletBalance,String address)
	{
		this.id=id;
		this.name=name;
		this.walletBalance=walletBalance;
		this.address=address;
	}
}
class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	public Item(int id,String name,String companyName,double price,boolean isInStock)
	{
		this.id=id;
		this.name=name;
		this.companyName=companyName;
		this.price=price;
		this.isInStock=isInStock;
	}

}
class ShoppingWebsite{
	String purchaseItem(Item i, Customer3 c) throws ItemOutOfStockException, InsufficientBalanceException
	{
		if(i.isInStock==false)
			throw new ItemOutOfStockException("item is out of stock");
		if(i.price>c.walletBalance)
			throw new InsufficientBalanceException("customer wallet balance is not sufficient");
		return "Order Successful";
	}
}
class InsufficientBalanceException extends Exception{
	 InsufficientBalanceException(String s)
	 {
		 super(s);
	 }
}
class ItemOutOfStockException extends Exception{
	ItemOutOfStockException(String s)
	 {
		 super(s);
	 }
}
public class Question16 {
	public static void main(String[] args) throws ItemOutOfStockException, InsufficientBalanceException {
		Customer3 cusDet = new Customer3(927392, "Steve" ,5000.0, "USA");
		Item itemDet = new Item(27392, "T-Shirt", "US polo", 800, true);
		ShoppingWebsite obj = new ShoppingWebsite();
		String out = obj.purchaseItem(itemDet, cusDet);
		System.out.println(out);

	}
}
