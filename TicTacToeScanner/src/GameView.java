import java.util.Scanner;

public class GameView {
    private Scanner input;
    private GameLogic game;
    
    public GameView(Scanner input, GameLogic game) {
        this.input = input;
        this.game = game;
    }

    public void run() throws GameOverException {
        // Überladen
        this.welcome();
        this.welcome("Andreas");
        // this.welcome(5); <-- Java kompiliert nicht, Methode mit Name
        // "welcome" UND Argument Integer existiert NICHT
        
        // Law of Demeter; vs. this.game.board.print();
        this.game.printBoard();

        // ! = Negation
        // min. 5 max 9 Iterationen <-- User Input EINGABE
        while(!this.game.isFinished()) {
            this.playerAction();
        }
        
        System.out.println("Spieler " + this.game.getWinningPlayer() + " hat GEWONNEN!");
    }

    private void welcome() {
        System.out.println();
        System.out.println("Welcome to TicTacToe!");
        System.out.println();
    }

    // Überladen
    private void welcome(String name) {
        System.out.println();
        System.out.println("Welcome to TicTacToe!" + name);
        System.out.println();
    }

    private void playerAction() {
        System.out.print("Wähle dein Feld [1-9]: ");
        int number = this.input.nextInt();

        try {
            this.game.play(number);
        /*} catch (GameException exception) {
            System.out.println(exception.getMessage());*/
        } catch (PlayerCheatingException | GameOverException | FieldOccupiedException exception) {
            System.out.println(
                exception.getMessage()
            );
        }

        this.game.printBoard();
    }
}
