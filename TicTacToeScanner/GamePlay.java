import java.util.Scanner;

public class GamePlay {
    private Scanner input;
    private GameLogic game;
    
    public GamePlay(Scanner input, GameLogic game) {
        this.input = input;
        this.game = game;
    }

    public void run() {
        this.welcome();
        // Law of Demeter; vs. this.game.board.print()
        this.game.printBoard();

        while(!this.game.isFinished()) {
            this.playerAction();
        }
        
        try {
            System.out.println("Spieler " + this.game.getWinningPlayer() + " hat GEWONNEN!");
        } catch (GameOverException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private void welcome() {
        System.out.println();
        System.out.println("Welcome to TicTacToe!");
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
            System.out.println(exception.getMessage());
        }

        this.game.printBoard();
    }
}
