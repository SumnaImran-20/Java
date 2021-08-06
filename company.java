import java.util.Scanner;
class company
{
    public static void main(String args[])
    {
       Headquarter obj=new Headquarter();
       obj.getdetails();
       obj.showdetails();
       Mianbranch obj1=new Mianbranch();
       obj1.getDetails();
       obj1.showDetails();
    }
}

class Headquarter
{
    int totalemployee;
    String cityname;
    Scanner k=new Scanner(System.in);

    public void getdetails()
    {
        System.out.println("Enter City Where Headquarters is Sitiuated :");
        cityname=k.nextLine();
        System.out.println("Enter Total Number of Employees in Headquarters");
        totalemployee=k.nextInt();
    }

    public void showdetails()
    {   
        System.out.println();
        System.out.println("--Company Headquarters is Sitiuated in "+cityname+" and has "+totalemployee+" Employees--");
        System.out.println();
    }
}

class Mianbranch extends Headquarter
{
    void getDetails()
	{
		System.out.println("Enter City Where Main Branch is Sitiuated");
		cityname=k.nextLine();
		System.out.println("Enter The Total Number of Employees In Main Branch");
		totalemployee=k.nextInt();
	}

    void showDetails()
	{
        System.out.println();
		System.out.println("--Company Main Branch is Sitiuated in "+cityname+" and has "+totalemployee+" Employees--");
        System.out.println();
	}
}

