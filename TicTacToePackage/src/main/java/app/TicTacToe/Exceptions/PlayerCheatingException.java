package app.TicTacToe.Exceptions;


public class PlayerCheatingException extends GameException {
    public PlayerCheatingException() {
        super("Der Spieler ist nicht dran.");
    }
}