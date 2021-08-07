import java.util.Scanner;

class A
{ int z;
  public void addition(int x, int y)
  {
    z=x+y;
    System.out.println("The sum is :"+z);
    System.out.println("This is class A");
    System.out.println();
  }  
}

class B extends A
{ int z;
  public void subtraction(int x, int y)
  {
    z=x-y;
    System.out.println("The difference is :"+z);
    System.out.println("This is class B");
    System.out.println();
  }  
}
class C extends B
{ int z;
  public void multiplication(int x, int y)
  {
    z=x*y;
    System.out.println("The product is :"+z);
    System.out.println("This is class C");
    System.out.println();
  }  
}
 public class My_Calculation extends C
{
   
   public static void main(String args[])
   {
     int a,b;
     Scanner input=new Scanner(System.in);
     System.out.println("First intger is  :");
     a=input.nextInt();
     System.out.println("Second integer is");
     b=input.nextInt();

     My_Calculation demo= new My_Calculation();
     demo.addition(a,b);
     demo.subtraction(a,b);
     demo.multiplication(a,b);
   }
}