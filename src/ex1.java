import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        int impares = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                impares++;
            }
        }

        System.out.printf("Entre 1 e %d existem %d números ímpares", n, impares);

        sc.close();
    }

}
