class Main {
    public static void main(String[] args) {
        hashLoop();
        condition();
        rocket();
        maxNumber(3,2,1);
        maxNumber(1,2,1);
        maxNumber(1,2,3);
        maxNumber(1,1,1);
    }

    public static void hashLoop() {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void condition() {
        if(5 > 2) {
            System.out.println("5 is greater than 2!");
        }
    }

    public static void maxNumber(int a, int b, int c) {
        System.out.println("Zahlen sind " + a + ", " + b + ", " + c);
        // logisches und &&
        if (a > b && a > c) {
            System.out.println("Höchste Zahl: " + a);
        } else if (b > a && b > c) {
            System.out.println("Höchste Zahl: " + b);
        } else if (c > a && c > b) {
            System.out.println("Höchste Zahl: " + c);
        } else {
            System.out.println("keine höchste Zahl.");
        }
    }

    public static void rocket() {
        cone();
        box();
        System.out.println("  |Rocket| |Rocket|");
        rocketName(1);
        rocketName(2);
        System.out.println();
        box();
        cone();
    }

    public static void cone() {
        System.out.println("     /\\       /\\");
        System.out.println("    /  \\     /  \\");
        System.out.println("   /    \\   /    \\");
    }

    // rocketNumber = "Argument der Methode rocketName", "Parameter", ~"Variable" 
    public static void rocketName(int rocketNumber) {
        System.out.print("  |  #" + rocketNumber + "  | ");
        // vgl Excel dort wird & anstatt von + verwendet
        // ="  |  #"&C2&"  | "
    }

    public static void box() {
        System.out.println("  +------+ +------+");
        System.out.println("  |      | |      |");
        System.out.println("  +------+ +------+");
    }
}