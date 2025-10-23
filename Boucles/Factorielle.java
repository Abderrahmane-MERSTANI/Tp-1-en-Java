import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier n : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
        } else {
            double fact = sc.nextDouble(); 
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println(n + "! = " + fact);
        }

        sc.close();
    }
}
