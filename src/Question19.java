class Cue{
	private int pieces;
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	public boolean isRetain() {
		return retain;
	}
	public void setRetain(boolean retain) {
		this.retain = retain;
	}
	private boolean retain;
	public Cue(int pieces,boolean retain)
	{
		this.pieces=pieces;
		this.retain=retain;
	}
}
class Retention
{
	Cue cue=null;
	public Retention(Cue cue) {
		this.cue=cue;
	}
	String checkCue(int p) throws CueException {
		if(cue.isRetain()==false)
		{
			throw new CueException("Cue not retained");
		}
		if(p<cue.getPieces())
		{
			throw new CueException("More pieces required");
		}
		if(p>cue.getPieces())
		{
			throw new CueException("Update required");
		}
		return "Cue updated";
		
	}
	String playGame(int p) 
	{
		try {
			checkCue(p);
		}
		catch(CueException e)
		{
			return "Cannot use this cue";
		}
		catch(Exception e)
		{
			return "Other exception";
		}
		return "Welcome to the game";
	}
}

class CueException extends Exception
{
	CueException(String s)
	{
		super(s);
	}
}
public class Question19 {
	public static void main(String[] args)
	{
		Cue c=new Cue(13,true);
		Retention r= new Retention(c);
		String ans = r.playGame(5);
		System.out.println(ans);
	}
}
