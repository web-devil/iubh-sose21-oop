package app.TicTacToe;
import app.TicTacToe.Exceptions.PlayerCheatingException;

public class PlayerManagement {
    // Magic Strings
    private final String PLAYER_SYMBOL_X = "x";
    private final String PLAYER_SYMBOL_O = "o";

    String lastPlayer = this.PLAYER_SYMBOL_O;

    public String getLastPlayer() {
        return this.lastPlayer;
    }

    public PlayerManagement setLastPlayer(String player) throws PlayerCheatingException {
        if (player != this.PLAYER_SYMBOL_O && player != this.PLAYER_SYMBOL_X) {
            throw new IllegalArgumentException("Invalid player symbol.");
        }   

        if (player == this.lastPlayer) {
            throw new PlayerCheatingException();
        }

        this.lastPlayer = player;

        return this;
    }

    public String getNextPlayer() {
        if (this.lastPlayer == this.PLAYER_SYMBOL_O) {
            return this.PLAYER_SYMBOL_X;
        } else if (this.lastPlayer == this.PLAYER_SYMBOL_X) {
            return this.PLAYER_SYMBOL_O;
        } else {
            throw new RuntimeException("Invalid player symbol.");
        }
    }
}
