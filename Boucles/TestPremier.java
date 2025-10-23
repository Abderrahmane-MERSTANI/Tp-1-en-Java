import java.util.Scanner;

public class TestPremier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre n : ");
        int n = sc.nextInt();

        boolean estPremier = true;

        if (n < 2) {
            estPremier = false; 
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    estPremier = false;
                    break; 
                }
            }
        }

        if (estPremier) {
            System.out.println(n + " est un nombre premier.");
        } else {
            System.out.println(n + " n'est pas un nombre premier.");
        }

        sc.close();
    }
}
