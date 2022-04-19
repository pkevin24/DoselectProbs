class Rating{
	private int imdbRating;
    public int getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(int imdbRating) {
		this.imdbRating = imdbRating;
	}
	public int getNominee() {
		return nominee;
	}
	public void setNominee(int nominee) {
		this.nominee = nominee;
	}
	private int nominee;
    Rating(int imdbRating, int nominee)
    {
    	this.imdbRating=imdbRating;
    	this.nominee=nominee;
    }

}
class Validator{
	String canBeConsideredForTheAward(Rating rating) throws MovieRatingException
	{
		if(rating.getImdbRating()<7)
			throw new MovieRatingException("Not elgible for filmfare");
		if(rating.getNominee()<4)
			throw new MovieRatingException("Minimum 4 nominee required");
		return "Considered for the award";
	}
	String sendInvite(Rating rating) {
		try {
			canBeConsideredForTheAward(rating);
		}
		catch(MovieRatingException e)
		{
			return "Not invited";
		}
		catch(Exception e)
		{
			return "other exception";
		}
		return "Actors and Directors Invited";
	}
}
class MovieRatingException extends Exception{
	MovieRatingException(String s)
	{
		super(s);
	}
}
public class Question4 {
	public static void main(String[] args) throws MovieRatingException {
		Rating rating = new Rating(9, 7);
		Validator v = new Validator();
		String s = v.canBeConsideredForTheAward(rating);
		String t = v.sendInvite(rating);
		s.toLowerCase();
		t.toLowerCase();
		System.out.println(s);
		System.out.println(t);


	}
}
