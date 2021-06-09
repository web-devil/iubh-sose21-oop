package app.TicTacToe;
import app.TicTacToe.Exceptions.GameException;
import java.util.Scanner;

public class Game {
    Scanner input;

    public Game(Scanner input) {
        this.input = input;
    }

    public void run() {
        GameLogic logic = new GameLogic(new PlayerManagement(), new GameBoard());
        GameView game = new GameView(this.input, logic); 
        
        try {
            game.run();
        } catch (GameException exception) {
            System.out.println("The game crashed.");
        }
    }
}
