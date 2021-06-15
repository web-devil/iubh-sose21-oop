import java.util.Scanner;

class Menu {
    private Scanner scanner;
    private IPlayerManagement playerManagement;
    private RenamePlayerController renameController;
    private ShowScoreboardController scoreboard;
    private StartGameController game;

    public Menu(Scanner scanner, IPlayerManagement playerManagement, RenamePlayerController renameController, ShowScoreboardController scoreboard, StartGameController game) {
        this.scanner = scanner;
        this.renameController = renameController;
        this.scoreboard = scoreboard;
        this.game = game;
        this.playerManagement = playerManagement;
    }

    public void printAndSelect() {
        boolean showMenuAsNext = true;
        while(showMenuAsNext) {
            System.out.println();
            System.out.println();
            System.out.println("Willkommen im Hauptmenü!");
            System.out.println("========================");
            System.out.println();
            System.out.println("-   Neues Spiel starten (1)");
            System.out.println("-   Player 1 Namen eingeben (2)");
            System.out.println("-   Player 2 Namen eingeben (3)");
            System.out.println("-   Scoreboard anzeigen (4)");
            System.out.println("-   Programm verlassen (9)");
            System.out.println();
            int selectedMenuItem = this.scanner.nextInt();

            switch(selectedMenuItem) {
                case 1:
                    this.game.execute(
                        this.playerManagement.getPlayer1(),
                        this.playerManagement.getPlayer2()
                    );
                    break;
                case 2:
                    this.renameController.execute(
                        this.playerManagement.getPlayer1()
                    );
                    break;
                case 3:
                    this.renameController.execute(
                        this.playerManagement.getPlayer2()
                    );
                    break;
                case 4:
                    this.scoreboard.execute(
                        this.playerManagement.getPlayer1(),
                        this.playerManagement.getPlayer2()
                    );
                    break;
                case 9:
                    System.out.println("Auf Wiedersehen!");
                    this.playerManagement.onExit();
                    showMenuAsNext = false;
                    break;
                default:
                    System.out.println("Ungültige Auswahl");
            }
        }
    }

}