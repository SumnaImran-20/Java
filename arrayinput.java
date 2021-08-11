import java.util.Scanner;
class arrayinput
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("---Sum Of digits pesent inside an array---");
		
		int size = 5;
	    int [] numbers = new int [5];
		
		System.out.println("Input digits please");
		for (int i=0; i < numbers.length ; i++)
		{
			numbers[i] = sc.nextInt();
		}
		
		for(int i=0; i < numbers.length ; i++)
		{
			System.out.println("The value stored in array on index "+i+" is: "+numbers[i]);
		}
		
		int sum =0;
		for (int i=0; i < numbers.length ; i++)
		{
			sum = sum + numbers[i];
		}
		System.out.println();
		System.out.println("Sum is: " + sum);
	}	
}