package Question33_60;
class Build{
	int length;
	int width;
	Build(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	public String builder(int blength, int bwidth, int count) throws ShortageException, TendorException
	{
		
		if(length%blength==0 && width%bwidth==0 && (bwidth*blength)>count)
			throw new ShortageException("Need more bricks");
		else if((length%blength!=0 || width%bwidth!=0) && (blength*bwidth)<count)
			throw new TendorException("Building dimension mismatched");
		else if((length%blength!=0 || width%bwidth!=0) && (blength*bwidth)>=count)
			throw new ShortageException("Need more bricks with dimension mismatched");
		return "builder";
	}
	
}
class ShortageException extends Exception{
	ShortageException(String s)
	{
		
		super(s);
	}
}
class TendorException extends Exception{
	TendorException(String s)
	{
		
		super(s);
	}
}
public class Question49 {
	public static void main(String[] args) throws ShortageException, TendorException {
		Build build = new Build(100, 100);
		System.out.println(build.builder(10,10,100));
		System.out.println(build.builder(10,10,50));

	}
}
