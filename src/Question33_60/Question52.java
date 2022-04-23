package Question33_60;
import java.util.*;
class Box
{
	private int id;
	private int volume;
	Box(int id,int volume)
	{
		this.id=id;
		this.volume=volume;
	}
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setVolume(int volume)
	{
		this.volume=volume;
	}
	int getVolume()
	{
		return volume;
	}
	
}
class ContainerBox
{
	ArrayList<Box>boxes=new ArrayList<>();
	public void addBox(Box box)
	{
		boxes.add(box);
	}
	String addWater(int id,int liter)
	{
		int i;
		for(i=0;i<boxes.size();i++)
		{
			if(boxes.get(i).getId()==id) {
				if(boxes.get(i).getVolume()>=liter)
				{
					int l=boxes.get(i).getVolume()-liter;
					boxes.get(i).setVolume(l);
					return "Water filled";
				}else
					return "Box Full";
					
					
				
			}
		}
		return "No Box found";
		}
		
	ArrayList<Box>getBoxes(int volume,int comparator)
	{
		ArrayList<Box>a=new ArrayList<>();
		if(comparator==1)
		{
			for(int i=0;i<boxes.size();i++)
			{
				if(volume>boxes.get(i).getVolume())
					a.add(boxes.get(i));
			}
		}
		else if(comparator==2)
		{
			for(int i=0;i<boxes.size();i++)
			{
				if(volume<boxes.get(i).getVolume())
					a.add(boxes.get(i));
			}
		}
		else
			return null;
		return a;
			
	}
}
public class Question52 {
	public static void main(String[] args) {
		Box box = new Box(1,200);
		ContainerBox containerBox = new ContainerBox();
		containerBox.addBox(box);
		System.out.println(containerBox.addWater(1,100));
		System.out.println(containerBox.getBoxes(200,4));

	}
}
