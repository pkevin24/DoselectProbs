class Racer{
	public String action;
	  public int runScore;
	   public int jumpScore;
	   public int crawlScore;
	   public int r=0,j=0,c=0;
	   public Racer(String action, int runScore, int jumpScore, int crawlScore)
	   {
		   this.action=action;
		   this.runScore=runScore;
		   this.jumpScore=jumpScore;
		   this.crawlScore=crawlScore;
	   }
	   public String goodAt()
	   {
		   for(int i=0;i<action.length();i++)
		   {
			   if(action.charAt(i)=='r')
				   r++;
			   if(action.charAt(i)=='j')
				   j++;
			   if(action.charAt(i)=='c')
				   c++;
		   }
		   if(j==c)
		   {
			   return "Perfect";
		   }
		   else if(j>c)
			   return "Jumper";
		   return  "Crawler";
	   }
	   int finalScore()
	   {
		   return r*runScore+j*jumpScore+c*crawlScore;
	   }
}
public class Question23 {
	public static void main(String[] args) {
		Racer racer = new Racer("jjccrrj",10,20,30);
		String s1=racer.goodAt();
		System.out.println(s1);
		System.out.println(racer.finalScore());

	}
}
