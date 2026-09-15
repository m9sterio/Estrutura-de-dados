import java.util.Scanner;

public class Questao15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.println("O MMC de " + a + " e " + b + " é: " + mmc(a, b));
        sc.close();
    }
    public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }

    public static int mmc(int a, int b) {
        return (a * b) / mdc(a, b);
    }


}
