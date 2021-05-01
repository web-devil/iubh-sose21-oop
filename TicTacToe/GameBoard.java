import java.util.ArrayList;

public class GameBoard {
    String lastPlayer;
    boolean finished = false;
    private ArrayList<String> fields = new ArrayList<String>();

    public GameBoard() {
        for (int i = 1; i <= 10; i++) {
            this.fields.add(" ");
        }
    }

    public void print() {
        // format
        System.out.printf(" %s | %s | %s ", this.fields.get(1), this.fields.get(2), this.fields.get(3));
        System.out.println();
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s ", this.fields.get(4), this.fields.get(5), this.fields.get(6));
        System.out.println();
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s ", this.fields.get(7), this.fields.get(8), this.fields.get(9));
        System.out.println();
        System.out.println();
    }

    // Clean Code Discussion
    // Readability and Maintainability are biggest goal for high software quality
    public void print2() {
        for (int i = 0; i <= 6; i = i + 3) {
            System.out.printf(" %s | %s | %s ", this.fields.get(i), this.fields.get(i+1), this.fields.get(i+2));
            System.out.println();
            if (i < 6) {
                System.out.println("---+---+---");
            }  
        }
        System.out.println();
    }

    public void play(int fieldIndex, String player) {
        // Guards => early return
        if (this.finished) {
            System.out.println("Das Spiel ist bereits beendet.\n");
            return;
        }

        if (this.lastPlayer != "" && this.lastPlayer == player) {
            System.out.println("Du bist nicht dran.\n");
            return;
        }

        if (this.fields.get(fieldIndex) != " ") {
            System.out.println("Feld ist bereits belegt.\n");
            return;
        }

        this.fields.set(fieldIndex, player);
        this.lastPlayer = player;
        this.print();

        if (this.hasWon(player)) {
            this.finished = true;
            System.out.println("Spieler " + player + " hat GEWONNEN!");
        }
    }

    private boolean hasWon(String player) {
        return (
            // horizontal
               (this.fields.get(1) == player && this.fields.get(2) == player && this.fields.get(3) == player)
            || (this.fields.get(4) == player && this.fields.get(5) == player && this.fields.get(6) == player)
            || (this.fields.get(7) == player && this.fields.get(8) == player && this.fields.get(9) == player)
            // vertikal
            || (this.fields.get(1) == player && this.fields.get(4) == player && this.fields.get(7) == player)
            || (this.fields.get(2) == player && this.fields.get(5) == player && this.fields.get(8) == player)
            || (this.fields.get(3) == player && this.fields.get(6) == player && this.fields.get(9) == player)
            // diagonal
            || (this.fields.get(1) == player && this.fields.get(5) == player && this.fields.get(9) == player)
            || (this.fields.get(3) == player && this.fields.get(5) == player && this.fields.get(7) == player)
        );
    }
}
