package app;
import app.TicTacToe.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(new Scanner(System.in));
        game.run();
    }
}
