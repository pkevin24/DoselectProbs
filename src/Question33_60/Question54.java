package Question33_60;
import java.util.*;
class Kingdom
{
	String life;
	String nonLife;
	int lifeSpan;
	Kingdom(String life, String nonLife, int lifeSpan)
	{
		this.life=life;
		this.nonLife=nonLife;
		this.lifeSpan=lifeSpan;
	}
	void setLife(String life)
	{
		this.life=life;
	}
	String getLife()
	{
		return life;
	}
	void setNonLife(String nonLife)
	{
		this.nonLife=nonLife;
	}
	String getNonLife()
	{
		return nonLife;
	}
	void setLifeSpan(int lifeSpan)
	{
		this.lifeSpan=lifeSpan;
	}
	int getLifeSpan()
	{
		return lifeSpan;
	}
	public String toString()
	{
		return "Kingdom{life='"+getLife()+"', nonLife='"+getNonLife()+"', lifeSpan="+getLifeSpan()+"}";
	}
	
}
class KingdomClassification
{
	List<String> getKingdom(List<Kingdom> list)
	{
		List<String>n=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			n.add(list.get(i).getLife());
		}
		return n;
	}
	Kingdom findNameWithValidity(List<Kingdom> list, String name, int lifeSpan)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getNonLife()==name && list.get(i).getLifeSpan()==lifeSpan)
				return list.get(i);
			
		}
		return null;
	}
}
public class Question54 {
	public static void main(String[] args) {
		KingdomClassification k = new KingdomClassification();
		 List<Kingdom> list = new ArrayList<Kingdom>();
		  list.add(new Kingdom("Protista", "Regnum", 3));
		  list.add(new Kingdom("Plantae", "Lapideum", 5));
//		---------------------------------------------------------
		System.out.println(k.getKingdom(list));
		System.out.println(k.findNameWithValidity(list, "Lapideum", 5));

	}
}
