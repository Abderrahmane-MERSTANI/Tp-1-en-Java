import java.util.Scanner;

public class NoteLettre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lecture de la note
        System.out.print("Entrez la note (0-20) : ");
        double note = sc.nextDouble();

        // Détermination de la lettre
        char lettre;

        if (note >= 16 && note <= 20) {
            lettre = 'A';
        } else if (note >= 14) {
            lettre = 'B';
        } else if (note >= 12) {
            lettre = 'C';
        } else if (note >= 10) {
            lettre = 'D';
        } else {
            lettre = 'F';
        }

        // Affichage
        System.out.println("La note en lettre est : " + lettre);

        sc.close();
    }
}
