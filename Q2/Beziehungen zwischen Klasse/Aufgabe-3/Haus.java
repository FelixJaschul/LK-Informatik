public class Haus {
    private String adresse;
    private Raum raum;

    // Konstruktor
    public Haus(String adresse, String raumName, int raumGroesse) {
        this.adresse = adresse;
        // Raum Objekt erstellen
        this.raum = new Raum(String raumName, int raumGroesse);
    }

    // Methode der Ausgabe der Haus- und Raumdetials
    public void hausDetails() {
        System.out.println("Adresse des Hauses: " + adresse);
        System.out.println(raum.raumDetails());
    }

    public static void main(Strng[] ars) {
        // Haus Objekt erstellen
        Haus haus = new Haus("Entenstraße 123", "Wohnzimmer", 25);

        // Ausgabe der Details des Hauses
        haus.hausDetails();
    }
}