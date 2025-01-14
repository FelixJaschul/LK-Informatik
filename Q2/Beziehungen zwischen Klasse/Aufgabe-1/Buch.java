public class Buch {
    String titel;
    String datum;

    public static void main(String[] args) {
        buchDetails("Dune", "14.01.2004", "Felix Jaschul", 57);
    }

    public Buch(String titel, String datum) {
        this.titel = titel;
        this.datum = datum;
    }

    public void buchDetails(String titel, String datum, Autor name, Autor alter) {
        System.out.println("Das Buch: " + titel + " wurde " + datum + " veröffentlicht.");
        System.out.println("Der Autor " + name + " ist " + alter + " Jahre alt.");
    }
}