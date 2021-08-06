import java.util.Scanner;

class conditions {
    public static void main(String[] args) 
    {

      Scanner myObj=new Scanner(System.in);
      String username="Admin";
      int password=12345;
      System.out.println("Enter Your Name !"); 
      String name=myObj.nextLine();
      System.out.println("Enter Your Password !");
      int pass=myObj.nextInt();  
      
       if (username.equals(name) && password==pass) {
        System.out.print("Successfully Log In !");
    } else {
        System.out.print("Sorry Log In Failed !");
    }
    }    
     
}

