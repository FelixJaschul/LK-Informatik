public class Universitaet {
    String name;
    Professor professor;

    // Konstruktor
    public Universiaet(String name, Professor professor) {
        this.name = name;
        this.professor = professor;
    }

    // Ausgagbe der Universitätsdetails
    public void universitaetDetails() {
        System.out.ptintln("Universität: " + name);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName() + ", Fachgebiet: " + professor.getFachgebiet);
        } else {
            System.out.println("Diese Universität hat derzeit keine*n Professor*in.");
        }
    }

    public static void main(String[] args) {
        // Professor Objekt erstellen
        Professor prof = new Professor("Dr. Müller", "Physik");

        // Universitäts Objekt erstellen
        Universiaet uni = new Universiaet("TU Berlin", prof);

        // Details der Univerität abrufen
        uni.universitaetDetails();
    }
}
