//ENUM 

enum level
{
	LOW,
	MEDIUM,
	HIGH
}

public class class2
{
	public static void main (String [] args)
	{
		System.out.println("Output Through Loop");
		
		for(level myobj: level.values() )
		    System.out.println(myobj);
	}
}