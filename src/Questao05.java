public class Questao05 {

    public static void main(String[] args) {
        System.out.println(numero(100));
    }
    public static int numero(int x) {
        int n1 =0;
        if (n1 == x){
            return x;
        }
        int total = numero(x-1);
        System.out.println(x);
        return x;
    }
}
