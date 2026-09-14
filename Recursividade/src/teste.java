public class teste {

    public class Q3 {

        public static void decimal(int x){

            if (x < 2){
                System.out.println(x);
                return;
            }

            decimal(x / 2);
            System.out.println(x % 2);

        }
        public static void main(String[] args) {
            int numero = 12;

            System.out.println("Binário: ");
            decimal(numero);
        }
    }
}
