import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            double quadrado = Math.pow(i, 2);
            double cubo = Math.pow(i, 3);

            System.out.printf("%d %.0f %.0f%n", i,quadrado, cubo);
        }

        sc.close();
    }

}
