import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Using Scanner for Getting Input from User
        Scanner inputScannerObject = new Scanner(System.in);

        System.out.println("#9 Please enter a string");
        String enteredString = inputScannerObject.nextLine();
        System.out.println("#11 You have entered: " + enteredString);

        System.out.println("#3 Please enter an integer");
        int enteredInt = inputScannerObject.nextInt();
        System.out.println("#15 You have entered: " + enteredInt);

        System.out.println("#17 Please enter a float (number with comma => .)");
        float commaNumber = inputScannerObject.nextFloat();
        System.out.println("#19 You have entered: " + commaNumber);
    }
}