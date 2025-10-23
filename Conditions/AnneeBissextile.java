import java.util.Scanner;

public class AnneeBissextile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une année : ");
        int annee = sc.nextInt();

        boolean bissextile;

        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            bissextile = true;
        } else {
            bissextile = false;
        }

        if (bissextile) {
            System.out.println(annee + " est une année bissextile.");
        } else {
            System.out.println(annee + " n'est pas une année bissextile.");
        }

        sc.close();
    }
}
