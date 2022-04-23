package Question33_60;
import java.util.*;
class Song
{
	String name;
	String runTime;
	String singer;
	Song(String name,String runTime,String singer)
	{
		this.name=name;
		this.runTime=runTime;
		this.singer=singer;
	}
}
class PlayList
{
	List<Song>songs=new ArrayList<>();
	String playSong(String currentTime,Song song)
	{
		String time1[]=currentTime.split(":");
		int t1=Integer.valueOf(time1[0])*60+Integer.valueOf(time1[1]);
		String time2[]=song.runTime.split(":");
		int t2=Integer.valueOf(time2[0])*60+Integer.valueOf(time2[1]);
		if(t1>t2)
			return "Song is being continued";
		return "Song replayed";
	}
	String addSong(Song song)
	{
		if(songs.contains(song))
			return "Cannot be added";
		songs.add(song);
		return "Added";
	}
}
public class Question50 {
	public static void main(String[] args) {
		PlayList lis=new PlayList();
		Song s1=new Song("Venom", "4:58","Eminem");
		Song s2=new Song("Hello","2:45","KP");
		System.out.println(lis.addSong(s1));
		System.out.println(lis.playSong("2:30", s2));
		

	}
}
