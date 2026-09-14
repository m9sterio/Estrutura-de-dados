public class Questao02 {

    public static void main(String[] args) {
    int valor = 5;
        System.out.println(fatorial(valor));
    }
    public static int fatorial(int x) {
        if (x==0 || x==1){
            return  1;

        }
        return x * fatorial(x-1);
    }
}
