package ThisIsAPackage;

import java.util.Scanner; 
  
public class GetInputFromUser { 
    public static void main() 
    { 
        // Using Scanner for Getting Input from User 
        Scanner in = new Scanner(System.in); 
  
        System.out.println("Please enter a string"); 
        String s = in.nextLine(); 
        System.out.println("You entered string " + s); 
  
        System.out.println("Please enter an int");
        int a = in.nextInt(); 
        System.out.println("You entered integer " + a); 
  
        // java.util.InputMismatchException
        System.out.println("Please enter a float");
        float b = in.nextFloat(); 
        System.out.println("You entered float " + b); 
    } 
}