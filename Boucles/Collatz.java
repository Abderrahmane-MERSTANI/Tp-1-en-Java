import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre n : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Le nombre doit être positif.");
        } else {
            int steps = 0;
            int current = n;

            System.out.println("Suite de Collatz :");
            System.out.print(current + " ");

            while (current != 1) {
                if (current % 2 == 0) {
                    current /= 2;
                } else {
                    current = 3 * current + 1;
                }
                System.out.println(current + " ");
                steps++;
            }

            System.out.println("\nNombre d'étapes jusqu'à 1 : " + steps);
        }

        sc.close();
    }
}
