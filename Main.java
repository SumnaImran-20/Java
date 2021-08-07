//POLYMORPHISM BY METHOD OVERRIDING 
//RETURN TYPE IS ALWAYS SAME

class Main
{
   public static void main (String [] args)
   {
     Mobilephone mymobile= new Mobilephone();
	 Mobilephone infinix= new Infinix();
	 Mobilephone oppo = new Oppo();
	 Mobilephone samsung= new Samsung();
	 
     mymobile.mobilephone();
     infinix.mobilephone();
     oppo.mobilephone();
     samsung.mobilephone();	 
   }
}

class Mobilephone
{
	public void mobilephone()
	{
		System.out.println("Mobile Phone");
		System.out.println();
	}
}

class Infinix extends Mobilephone
{
	public void mobilephone()
	{
		System.out.println("Infinix Smart Phone!!");
		System.out.println();
	}
}

class Oppo extends Mobilephone
{
	public void mobilephone()
	{
		System.out.println("Oppo Smart Phones !");
		System.out.println();
	}
}

class Samsung extends Mobilephone
{
	public void mobilephone()
	{
		System.out.println("Samsung Smart Phones !");
	}
}