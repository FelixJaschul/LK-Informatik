public class Bibliothek {
    private String name;
    private Regal regal;

    // Konstruktor
    public Bibliothek(String name, Regal regal) {
        this.name = name;
        this.regal = regal;
    }

    public String bibDetails() {
        return Bibliothek.getName() + " " + Bibliothek.getRegal();
    }

    // Getter
    public String getName() {
        return name;
    }

    public Regal getRegal() {
        return regal;
    }

    public static void main(String[] args) {
        Bibliothek bib = new Bibliothek("Grand Bibliothek", regal);
        Regal regal = new Regal();
        Buch buch = new Buch("Dune", "18.01.2025", autor);
        Autor autor = new Autor("Maximilian Schmidt");

        System.out.prinln(bib.bibDetails());


    }
}