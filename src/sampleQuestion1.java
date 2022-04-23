class Player{
	private String name;
	private String score;
	Player(String name,String score)
	{
		this.name=name;
		this.score=score;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setScore(String score)
	{
		this.score=score;
	}
	String getScore()
	{
		return score;
	}
	
}
class ScoreCard
{
	Player player=null;
	ScoreCard(Player player)
	{
		this.player=player;
	}
	String getPlayer()
	{
		String name=player.getName();
		name=name.trim();
		String names[]=name.split("\\s+");
		name="";
		for(int i=0;i<names.length;i++)
		{
			name+=names[i];
		}
		player.setName(name);
		String scores[]=player.getScore().split(" ");
		if(scores.length<3)
			return "Less innings";
		return "Player Added";
	}
	String arrangeScore(int data)
	{
		String scores[]=player.getScore().split(" ");
		String s="";
		String s1="";
		for(int i=0;i<scores.length;i++)
		{
			if(Integer.valueOf(scores[i])==data)
				s1+=scores[i]+" ";
			s+=scores[i]+" ";	
			
		}
		s+=s1;
		return s;
	}
}
public class sampleQuestion1 {

}
