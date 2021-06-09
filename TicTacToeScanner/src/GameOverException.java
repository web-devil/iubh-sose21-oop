public class GameOverException extends GameException { 
    private static final String FINISHED = "Das Spiel ist bereits beendet.";
    private static final String NOT_FINISHED = "Das Spiel ist noch nicht beendet.";

    private boolean finished = true;

    public GameOverException() {
        // GameOverException.java:6: error: cannot reference this before
        // supertype constructor has been called
        super(GameOverException.FINISHED);
    }

    // Überladen <-- JAVA ist intelligent; findet automatisch den richtig
    // passenden Konstruktor je nach Parameter
    public GameOverException(boolean finished) {
        super(); // im Konstruktor MUSS super aufgerufen werden
        this.finished = finished;
    }

    // Überschreiben
    public String getMessage() {
        if (this.finished) {
            return GameOverException.FINISHED;
        } else {
            return GameOverException.NOT_FINISHED;
        }
    }
}