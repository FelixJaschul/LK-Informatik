public class Raum {
    private String name;
    private int groesse;

    // Konstruktor
    public Raum() {
        this.name = name;
        this.groesse = groesse;
    }

    public String raumDetails() {
        return "Raum: " + name + ", Größe: " + groesse + " m²";
    }

    // Getter der Groesse
    public int getGroesse() { return groesse; }

    // Getter des Namens
    public String getName() { return name; }
}