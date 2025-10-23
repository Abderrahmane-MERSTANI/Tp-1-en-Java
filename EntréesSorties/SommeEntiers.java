import java.util.Scanner;

public class SommeEntiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int a = sc.nextInt();
        System.out.print("Entrer un deuxieme entier : ");
        int b = sc.nextInt();
        int somme = a + b;
        System.out.println("La somme est : " + somme);
        sc.close();
    }
}
