import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dependency Injection

        Scanner input = new Scanner(System.in);
        // Objekte werden übergeben, damit wir deren Methoden nutzen können

        // Spiel-Interaktion = "x"/"o" => GameView
        // Feld => GameBoard
        // Spieler => PlayerManagement
        // Regeln => GameLogic

        GameLogic logic = new GameLogic(
            // implizite "Variable"
            new PlayerManagement(), 
            new GameBoard()
        );
        GameView game = new GameView(input, logic); 

        try {
            game.run();
        } catch (GameException exception) {
            System.out.println("The game crashed.");
        }
    }
}
