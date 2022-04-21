package Question33_60;

class Player{
	int  requiredRuns;
	String summary;
	Player(int requiredRuns,String summary)
	{
		 this.requiredRuns= requiredRuns;
		 this.summary=summary;
	}
}
class Match{
	String checkTarget(Player player) throws MatchException
	{
		int total=0;
		for(int i=0;i<player.summary.length();i++)
		{
			if(player.summary.charAt(i)=='W')
				throw new MatchException("Out");
			total+=Character.getNumericValue(player.summary.charAt(i));
			
			
			
		}
		if(total<player.requiredRuns)
			throw new MatchException("Lost by runs");
		return "We may win";
	}
	String results(Player player) 
	{
		try {
			checkTarget(player);
		}
		catch(MatchException e)
		{
			return "We lost";
		}
		catch(Exception e)
		{
			return "Other exception";
		}
		return "We won";
	}
}
class MatchException extends Exception{
	MatchException(String s)
	{
		super(s);
	}
}
public class Question37 {
	public static void main(String[] args) throws MatchException {
		Player p=new Player(12,"123461");
		Match m=new Match();
		String s = m.checkTarget(p);
		String t = m.results(p);
		s.toLowerCase();
		t.toLowerCase();
		System.out.println(s);
		System.out.println(t);

	}
}
