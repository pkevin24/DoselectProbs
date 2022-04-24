import java.util.ArrayList;

class Validator1{
	String checkComment(String comment) throws SpamCommentException
	{
		ArrayList<String>a=new ArrayList<>();
		a.add("abcde");
		a.add("lmno");
		a.add("pqrst");
		a.add("wxyz");
		int count=0;
//		String s[]=comment.split(" ");
//		int n=s.length;
		for(int i=0;i<4;i++)
		{	
			if(comment.split(a.get(i)).length>1 || comment.contains(a.get(i)))
				count+=1;
		}
		if(count==1)
		{
			throw new SpamCommentException("spam comment");
		}
		else if(count>=2)
			throw new SpamCommentException("account ban due to spam comment");
		return "comment is not spam";
	}
	String commentTheString(String comment)
	{
		try {
			checkComment(comment);
		}
		catch(SpamCommentException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "comment posted";
	}
}

class SpamCommentException extends Exception
{
	SpamCommentException(String s)
	{
		super(s);
	}
}
public class Question5 {
	public static void main(String[] args) throws SpamCommentException {
		Validator1 obj = new Validator1();
//		-------------------------------------------
		String s1=obj.checkComment("hello my name is steve and using");
		String s2=obj.commentTheString("my comment is safe to post");
		System.out.println(s1);
		System.out.println(s2);
}
}
