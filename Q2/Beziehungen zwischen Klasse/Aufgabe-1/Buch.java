public class Buch {
    String titel;
    String datum;

    public buchDetails(String titel, String datum, Autor name, Autor alter) {
        System.out.println("Das Buch: " + titel + " wurde " + datum + " veröffentlicht.");
        System.out.println("Der Autor " + this.name + " ist " + this.alter + " Jahre alt.");
    }
}