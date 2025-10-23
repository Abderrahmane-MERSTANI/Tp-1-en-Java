import java.util.Scanner;

public class SommeFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre n : ");
        int n = sc.nextInt();

        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i;
        }

        System.out.println("La somme de 1 à " + n + " est : " + somme);

        sc.close();
    }
}
