public class Professor {
    private String name;
    private String fachgebiet;

    // Konstruktor
    public Professor(String name, String fachgebiet) {
        this.name = name;
        this.fachgebiet = fachgebiet;
    }

    // Getter für Name
    public String getName() {
        return name;
    }

    // Getter für Fachgebiet
    public String getFachgebiet() {
        return fachgebiet;
    }
}