class array
{
	public static void main(String[] args)
	{
		System.out.println("---Sum Of digits pesent inside an array---");
	int [] numbers = {1,2,3,4,5,6};
		System.out.println("Digits are:");
		int sum =0;
		for (int i=0; i < numbers.length ; i++)
		{
			System.out.println(numbers[i]);
		}
		
		for (int i=0; i < numbers.length ; i++)
		{
			sum = sum +numbers[i];
		}
		System.out.println();
		System.out.println("Sum is: " + sum);
	}	
}
