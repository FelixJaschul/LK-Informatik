public class Buch {
    String titel;
    String datum;

    // Konstruktor
    public Buch(String titel, String datum) {
        this.titel = titel;
        this.datum = datum;
    }

    // Getter
    public String getDatum() {
        return datum;
    }

    public String getTitel() {
        return titel;
    }
}