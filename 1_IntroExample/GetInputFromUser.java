package Vorlesung1;

import java.util.Scanner; 
  
class GetInputFromUser { 
    public static void main() 
    { 
        // Using Scanner for Getting Input from User 
        Scanner in = new Scanner(System.in); 
  
        String s = in.nextLine(); 
        System.out.println("You entered string " + s); 
  
        int a = in.nextInt(); 
        System.out.println("You entered integer " + a); 
  
        // java.util.InputMismatchException
        float b = in.nextFloat(); 
        System.out.println("You entered float " + b); 
    } 
}