import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dependency Injection & Inversion of Control
        Scanner input = new Scanner(System.in);
        GameLogic logic = new GameLogic(new PlayerManagement(), new GameBoard());
        GamePlay game = new GamePlay(input, logic); 
        
        game.run();
    }
}
