public class Rocket {
    // für ALLE Objekte dieser Klasse
    // gilt dieser Quellcode
    // "this" => jeweilige Objekt

    // Eigenschaften / Attribute / Property
    public String name;

    // Konstruktor => Name gleich Klassenname
    // kein Rückgabetyp genannt => Klassenname
    public Rocket(String name) {
        System.out.println("Dieses Objekt wurde gerade erzeugt!");

        // Variable in jeder Klasse, die auf das jeweilige OBJEKT verweist
        // Objekt IDENTITÄT
        this.name = name;
    }

    // Fähigkeiten / Methoden
    public void print() {
        System.out.println("Ausgabe von der Rakete: ");
        // Fähigkeiten können sich gegenseitig aufrufen
        this.printName();
    }

    public void printName() {
        System.out.println("\tName dieser Rakete ist " + this.name);
    }
}
