import java.util.Scanner;
public class notes
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Notes: 500, 100, 50, 20, 10");
        
		int amount;
		System.out.print("Enter Your Amout: ");
        amount = sc.nextInt();
		System.out.println();
		System.out.println("Current Amount is:" + amount);
		
		int totalamount = amount/500;
        System.out.println("You Have " + totalamount+ " Notes of 500");
        amount = amount - (totalamount * 500);
        System.out.println("Your Amount Now Is:" + amount);
		System.out.println();
		
		totalamount = amount/100;
        System.out.println("You Have " + totalamount+ " Notes of 100");
        amount = amount - (totalamount * 100);
        System.out.println("Your Amount Now Is:" + amount);
		System.out.println();
		
		totalamount = amount/50;
        System.out.println("You Have " + totalamount+ " Notes of 50");
        amount = amount - (totalamount * 50);
        System.out.println("Your Amount Now Is:" + amount);
		System.out.println();
		
		totalamount = amount/20;
        System.out.println("You Have " + totalamount+ " Notes of 20");
        amount = amount - (totalamount * 20);
        System.out.println("Your Amount Now Is:" + amount);
		System.out.println();
		
		totalamount = amount/10;
        System.out.println("You Have " + totalamount+ " Notes of 10");
        amount = amount - (totalamount * 10);
        System.out.println("Your Amount Now Is:" + amount);

	}
}