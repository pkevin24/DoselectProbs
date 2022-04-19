
public class base7 {
	public static void main(String[] args) {
		int n=201;
		int base=0;
		while(n!=0)
		{
			int rem=n%7;
			base=base*10+rem;
			n=n/7;
		}
		System.out.println(base);
		int base1=0;
		while(base!=0)
		{
			int rem1=base%10;
			base1=base1*10+rem1;
			base=base/10;
		}
		System.out.println(base1);
		
		
	}
	
}
