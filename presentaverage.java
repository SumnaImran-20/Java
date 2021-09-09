import java.util.Scanner;
class presentaverage
{
	public static void main(String[] args)
	{
		System.out.println("---Attendance Ratio Program---");
		Scanner sc = new Scanner(System.in);
		double totalstudent;
		double presentstudent;
		double average;
		
		System.out.println("Enter Total Strength Of Your Class:");
		totalstudent=sc.nextDouble();
		
		System.out.println("Enter Number Of Student Present In Your Class:");
		presentstudent=sc.nextDouble();
		
		//Calclating Average
		average = (presentstudent)/(totalstudent);
		average = average * 100;
		
		if(average >= 50)
		{
			System.out.println("You can conduct your class as attendance is " + average +"%");
		}
		else
		{
			System.out.println("You can conduct your class as attendance is " + average +"%");
		}
		
	}
}