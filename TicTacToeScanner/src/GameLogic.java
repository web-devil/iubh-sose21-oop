public class GameLogic {
    boolean finished = false;
    private PlayerManagement playerManagement;
    private GameBoard board;

    public GameLogic(PlayerManagement playerManagement, GameBoard board) {
        this.playerManagement = playerManagement;
        this.board = board;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public void printBoard() {
        this.board.print();
    }

    public String getWinningPlayer() throws GameOverException {
        if (this.isFinished()) {
            return this.playerManagement.getLastPlayer();
        }

        throw new GameOverException(false);
    }

    public void play(int fieldIndex) throws GameOverException, FieldOccupiedException, PlayerCheatingException {
        if (this.isFinished()) {
            throw new GameOverException();
        }

        String player = this.playerManagement.getNextPlayer();
        this.board.setFieldForPlayer(fieldIndex, player);
        this.playerManagement.setLastPlayer(player);

        if (this.board.hasWinningStrike(player)) {
            this.finished = true;
        }
    }
}
