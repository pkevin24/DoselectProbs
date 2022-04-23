package Question33_60;
import java.util.*;
class Fish
{
	String species;
	int weight;
	Fish(String species,int weight)
	{
		this.species=species;
		this.weight=weight;
	}
	void setSpecies(String species)
	{
		this.species=species;
	}
	String getSpecies()
	{
		return species;
	}
	void setWeight(int weight)
	{
		this.weight=weight;
	}
	int getWeight()
	{
		return weight;
	}
	public String toString()
	{
		return "Fish{species='"+getSpecies()+"' weight='"+getWeight()+"'}";
	}
}
class FishClass
{
	List<Fish>getFishWithLowestWeight(List<Fish> list)
	{
		int minWeight=list.get(0).getWeight();
		int minind=0;
		for(int i=0;i<list.size();i++)
		{
			if(minWeight<list.get(i).getWeight())
			{
				minWeight=list.get(i).getWeight();
				minind=i;
			}
		}
		List<Fish>f=new ArrayList<>();
		f.add(list.get(minind));
		return f;
	}
	List<Integer>mapFishWeight(List<Fish>list)
	{
		List<Integer>l=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			l.add(list.get(i).getWeight());
		}
		return l;
	}
}
public class Question55 {
	public static void main(String[] args) {
		FishClass f = new FishClass();
        List<Fish> list = new ArrayList<Fish>();
        list.add(new Fish("BlobFish", 20));
        list.add(new Fish("Guppy", 15));
        list.add(new Fish("Oscar", 60));
        list.add(new Fish("GoldFish", 5));
//--------------------------------------------------------   
        System.out.println(f.getFishWithLowestWeight(list));
        System.out.println(f.mapFishWeight(list));

	}
}
