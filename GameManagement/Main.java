import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RenamePlayerController renamePlayer = new RenamePlayerController(scanner);
        ShowScoreboardController scoreboard = new ShowScoreboardController();
        StartGameController game = new StartGameController(scanner);
        IPlayerManagement playerManagement = new FilePlayerManagement();
        Menu menu = new Menu(scanner, playerManagement, renamePlayer, scoreboard, game);

        menu.printAndSelect();
    }
}