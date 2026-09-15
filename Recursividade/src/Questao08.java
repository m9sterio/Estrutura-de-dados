public class Questao08 {

    public static void main(String[] args) {
        System.out.println(numero(5));

    }

    public static int numero(int x) {

        if (x == 0){

            return 0;
        }

        int valor =x +numero(x-1);
        return valor;
    }
}
