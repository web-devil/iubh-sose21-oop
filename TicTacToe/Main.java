public class Main {
    public static void main(String[] args) {
        GameBoard game = new GameBoard();

        System.out.println();
        System.out.println("Welcome to TicTacToe!");
        System.out.println();

        game.print();
        game.play(1, "x");
        game.play(4, "o");
        game.play(2, "x");
        game.play(5, "o");
        game.play(3, "x");
        game.play(6, "o");
    }
}
