import java.util.Scanner;


class Function {
    public static void main(String[] args) 
    {
      Scanner myObj=new Scanner(System.in);
      int num1;
      int num2;
      System.out.println("Enter Your First Value !"); 
      num1=myObj.nextInt();
      System.out.println("Enter Your Second value !");
      num2=myObj.nextInt();
      int res=print(num1,num2);
      System.out.println("Your answer is "+res);
       
    }
    public static int print(int num1, int num2)
        {
          return num1 * num2;
        }
     
}