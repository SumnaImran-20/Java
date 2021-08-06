//TRY CATCH

class class3
{
	public static void main (String [] args)
	{
		try
		{
			int [] mynumber={1,2,3};
			System.out.println(mynumber[2]);
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong");
		}
		finally //error aie na aie 'finally' tab bhi chalay ga 
		{
			System.out.println("The 'try catch' is finished");
		}
	}
}