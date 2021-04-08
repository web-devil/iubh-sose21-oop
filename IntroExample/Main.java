import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import ThisIsAPackage.GetInputFromUser;

public class Main {
    public static void main(String[] args) throws IOException {
        // System.out.println(args[0]);
        System.out.println("Please enter something");

        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        ); 

        String name = reader.readLine(); 
        System.out.println("You have entered: " + name); 

        GetInputFromUser.main();
    }
}
