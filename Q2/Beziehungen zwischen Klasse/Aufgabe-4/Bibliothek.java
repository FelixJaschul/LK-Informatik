public class Bibliothek {
    private String name;
    Regal regal;

    // Konstruktor
    public Bibliothek(String name, Regal regal) {
        this.name = name;
        this.regal = regal;
    }

    // Getter
    public String getName() {
        return name;
    }
}