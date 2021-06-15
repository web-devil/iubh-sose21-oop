class ShowScoreboardController implements IController {
    public void execute(Player player1, Player player2) {
        System.out.println();
        System.out.println();
        System.out.println("Scoreboard");
        System.out.println("==========");
        System.out.println();

        this.print(player1);
        System.out.println();
        this.print(player2);
    }

    private void print(Player player) {
        String name = "Spieler: " + player.getName();
        System.out.println(name);
        System.out.println("-".repeat(name.length()));
        System.out.println("Gewonnen: " + player.getCountWins());
        System.out.println("Verloren: " + player.getCountLosses());
    }
}