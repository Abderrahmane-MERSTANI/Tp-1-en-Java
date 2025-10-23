import java.util.Scanner;

public class MaxTroisNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nombre a : ");
        double a = sc.nextDouble();

        System.out.print("Entrez le nombre b : ");
        double b = sc.nextDouble();

        System.out.print("Entrez le nombre c : ");
        double c = sc.nextDouble();

        double max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Le plus grand nombre est : " + max);

        sc.close();
    }
}
