package Vorlesung1;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter something");

        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        ); 

        String name = reader.readLine(); 

        System.out.println(name); 

        GetInputFromUser.main();
    }
}
