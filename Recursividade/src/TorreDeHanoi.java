public class TorreDeHanoi {
    public static void main(String[] args) {
        int discos = 3;

        System.out.println("Solução da Torre de Hanói com " + discos + " discos:");
        mover(discos, 'A', 'B', 'C');
    }
    public static void mover(int n, char origem, char auxiliar, char destino) {
        if (n == 0) {
            return;
        }

        mover(n - 1, origem, destino, auxiliar);


        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);

        mover(n - 1, auxiliar, origem, destino);
    }

}
