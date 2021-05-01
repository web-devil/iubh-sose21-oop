// Information Hiding
// Visibility ("Sichtbarkeit")
public class RocketAscii {
    // Zustand = die Summe der Werte der Eigenschaften
    private int id;

    public RocketAscii(int id) {
        this.id = id;
    }

    public void print() {
        this.cone();
        this.box();
        this.rocketName();
        this.box();
        this.cone();
    }

    private void cone() {
        System.out.println("     /\\");
        System.out.println("    /  \\");
        System.out.println("   /    \\");
    }

    private void rocketName() {
        System.out.println("  |Rocket|");
        System.out.println("  |  #" + this.id + "  | ");
    }

    private void box() {
        System.out.println("  +------+");
        System.out.println("  |      |");
        System.out.println("  +------+ ");
    }
}
