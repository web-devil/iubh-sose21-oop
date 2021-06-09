package app.TicTacToe.Exceptions;

public class FieldOccupiedException extends GameException {
    public FieldOccupiedException() {
        super("Das Feld ist bereits belegt.");
    }
}