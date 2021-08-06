//CONSTRUCTOR DOES NOT HAVE A RETURN TYPE IN VOID 
// MODIFIERS ARE: PUBLIC, PROTECTED, PRIVATE AND DEFAULT
import java.util.Scanner;

class MyClass
{
	private int num;
	private String name;
	
	public MyClass( int num, String name)
	{
		this.num=num;
		this.name=name;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void setage(int num)
	{
		this.num=num;
	}
	
	public int getnum()
	{
		return num;
	}
}

public class ConsDemo
{
	public static void main (String args[])
	{
		String name;
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name!");
		name=sc.nextLine();
		System.out.println("Enter your age!");
		num=sc.nextInt();
		MyClass t1= new MyClass(num,name);
		System.out.println("Your Name: " + t1.getname() + " "+ "And Your Age is: " + t1.getnum());
	}
}
