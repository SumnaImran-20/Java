import java.util.Scanner;
class gpa
{
	public static void main (String [] args)
	{
		System.out.println("---GPA Program---");
		Scanner sc = new Scanner(System.in);
		int GPA;
		int obtainedmarks;
		int difference;
		
		System.out.println("Enter GPA:");
		GPA=sc.nextInt();
		
		System.out.println("Enter Obtained Marks:");
		obtainedmarks=sc.nextInt();
		
		//calcultaing difference
		difference = GPA - obtainedmarks;
		System.out.println("difference is : " + difference);
		
		if(difference < 3 && difference == 2)
		{
			obtainedmarks = obtainedmarks + 2;
			System.out.println("Your Marks Now is : " +obtainedmarks);
		}
		else if (difference < 3 && difference == 1)
		{
			obtainedmarks = obtainedmarks + 1;
			System.out.println("Your Marks Now is : " +obtainedmarks);
		}
		else
		{
			System.out.println("Sorry Your Marks Will Remain The Same : " +obtainedmarks);
		}
	}
}