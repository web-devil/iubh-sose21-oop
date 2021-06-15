class RuntimePlayerManagement implements IPlayerManagement {
    private Player player1;
    private Player player2;

    public RuntimePlayerManagement() {
        this.player1 = new Player();
        this.player2 = new Player();
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public void onExit() {
        // ich mache gar nichts.
    }
}