import java.util.Scanner;

public class TypeTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le côté a : ");
        double a = sc.nextDouble();

        System.out.print("Entrez le côté b : ");
        double b = sc.nextDouble();

        System.out.print("Entrez le côté c : ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Le triangle est équilatéral.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Le triangle est isocèle.");
            } else {
                System.out.println("Le triangle est scalène.");
            }
        } else {
            System.out.println("Les côtés ne forment pas un triangle valide.");
        }

        sc.close();
    }
}
