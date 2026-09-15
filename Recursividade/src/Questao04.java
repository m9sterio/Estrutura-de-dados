import javax.swing.*;

public class Questao04 {
    public static void main(String[] args) {
        System.out.println(somaDigitos(200));
    }
    public static int somaDigitos(int numero) {
        numero = Math.abs(numero);
        if (numero < 10) {
            return numero;
        }
        return numero % 10 + somaDigitos(numero / 10);
    }
}
