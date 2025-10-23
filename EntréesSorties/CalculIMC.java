import java.util.Scanner;

public class CalculIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez votre masse (en kg) : ");
        double masse = sc.nextDouble();

        System.out.print("Entrez votre taille (en mètres) : ");
        double taille = sc.nextDouble();
        
        double imc = masse / (taille * taille);

        System.out.printf("Votre IMC est : %.2f", imc);
    }
}
