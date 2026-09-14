/*1 – O método a seguir, executa o cálculo do MDC (máximo divisor comum) de
dois inteiros positivos m e n. Escreva um método recursivo equivalente.
public static int CalculaMDC(int m, int n){
    int r;
    do{
        r = m%n;
        m = n;
        n = r;
    } while (r != 0);
    return m;
}*/

public  class Questao01 {

        public static void main(String[] args) {
            int resultado = MDC(12,5);
            System.out.println(resultado);
        }
        public static int MDC(int m, int n) {

            int r = m % n;
            m = n;
            n = r;
            if (r == 0) {

                return m;
            }

            return MDC(m,n);
        }
    }
