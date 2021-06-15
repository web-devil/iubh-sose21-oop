import java.util.Scanner;

class StartGameController implements IController {
    private Scanner scanner;
    
    public StartGameController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execute(Player player1, Player player2) {
        System.out.println("Spiel starten");
        System.out.println("=============");
        System.out.println();
        System.out.println("Wer hat gewonnen? [1] oder [2]");
        
        int winner = this.scanner.nextInt();
        if (winner == 1) {
            player1.addWin();
            player2.addLoss();
        } else if (winner == 2) {
            player2.addWin();
            player1.addLoss();
        } else {
            System.out.println("Spiel abgebrochen (ungültige Eingabe)");
        }
    }
}