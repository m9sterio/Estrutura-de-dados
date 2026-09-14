public class Questao06 {

    public static void main(String[] args) {
        System.out.println(numero(100));
    }
    public static int numero(int x) {
        int n1 =0;
        if (n1 == x){
            return x;
        }
        System.out.println(x);
        int total = numero(x-1);
        return total;
    }
}
