public class Main {
    public static void main(String[] args) {
        // primitive Typen
        // - numbers: int, float, double
        // - String / char
        // - boolean: true / false

        int i = 1; // int integer = new Integer(1);
        String foo = "bar"; // String foo = new String("bar")
        // i++ // i = i + 1

        Rocket meineErsteRakete = new Rocket("Erste Rakete");
        meineErsteRakete.name = "Erste Rakete Name überschrieben";
        meineErsteRakete.print();

        Rocket meineZweiteRakete = new Rocket("Zweite Rakete");
        meineZweiteRakete.print();

        // Objekte sind unabhängig voneinander => OBJEKTIDENTITÄT
        meineErsteRakete.print();
    }
}
