import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de repetições: ");
        int n = sc.nextInt();

        int numsNoIntervalo = 0;
        int numsForaDoIntervalo = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();

            if (num > 10 && num < 20) {
                numsNoIntervalo++;
            } else {
                numsForaDoIntervalo++;
            }
        }

        System.out.printf("%d dentro do intervalo%n%d fora do intervalo%n", numsNoIntervalo, numsForaDoIntervalo);

        sc.close();
    }

}
