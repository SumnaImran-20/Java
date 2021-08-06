import java.util.Scanner;
public class hourtomin
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---HOURS TO MIN CONVERTOR---");
		System.out.println("Enter Hours");
		int hours;
		hours=sc.nextInt();
		
		int min;
		System.out.println("Enter Mins");
		min=sc.nextInt();
        
		int temp;
        int totalmins;

        temp = hours * 60;
        totalmins = temp + min;
        System.out.println("Total Minutes are " + totalmins);
      
	}
}