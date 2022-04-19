class Stocks{
	  float stockRate;
	  Stocks(float stockRate)
	  {
		  this.stockRate=stockRate;
	  }
	  String checkRate(float Rate) throws StockLowException,StockHighException
	  {
		  if(Rate<80)
			  throw new StockLowException("Under Loss");
		  if(Rate>80)
			  throw new StockHighException("Under Profit");
		  return "Hope to raise";
	  }
}
class StockLowException extends Exception
{
	StockLowException(String s)
	{
		super(s);
	}
}
class StockHighException extends Exception
{
	StockHighException(String s)
	{
		super(s);
	}
}
public class Question30 {
	public static void main(String[] args) throws StockHighException,StockLowException {
		Stocks stock = new Stocks(10.0f);
		System.out.println(stock.checkRate(5.0f));

	}
}
