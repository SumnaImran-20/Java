import java.util.Scanner;

public class Calculator {

public static void main(String[] args) 
     {
    	Scanner myObj=new Scanner(System.in);
        double num1;
        double num2;
        double ans;
        char op;
        String name;

        System.out.println("Enter Your Name Please !"); 
        name=myObj.nextLine();
            
        System.out.println("Welcome: "+name);
        System.out.println("Enter 2 numbers to calculate");

        System.out.println("First number");
        num1=myObj.nextDouble();

        System.out.println("Second number");
        num2=myObj.nextDouble(); 

        System.out.print("Enter an operator (+, -, *, /): ");
        op=myObj.next().charAt(0);
        
        switch(op){
               case '+': ans=num1+num2;
                  break;
               case '-': ans=num1-num2;
                  break;
               case '*': ans=num1*num2;
                  break;
               case '/': ans=num1/num2;
                  break;
               default: System.out.println("Enter Correct Operator");
                  return;
        }
        System.out.println("the result is given as follows:\n");
        System.out.printf(num1+ " " +op+" "+num2+ "="+ans);
      
    }

}