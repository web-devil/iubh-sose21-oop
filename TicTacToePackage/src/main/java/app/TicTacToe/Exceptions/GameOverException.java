package app.TicTacToe.Exceptions;


public class GameOverException extends GameException { 
    private static final String FINISHED = "Das Spiel ist bereits beendet.";
    private static final String NOT_FINISHED = "Das Spiel ist noch nicht beendet.";

    private boolean finished = true;

    public GameOverException() {
        // GameOverException.java:6: error: cannot reference this before
        // supertype constructor has been called
        super(GameOverException.FINISHED);
    }

    // Überladen
    public GameOverException(boolean finished) {
        super();
        this.finished = finished;
    }

    // Überschreiben
    public String getMessage() {
        if (finished) {
            return GameOverException.FINISHED;
        } else {
            return GameOverException.NOT_FINISHED;
        }
    }
}