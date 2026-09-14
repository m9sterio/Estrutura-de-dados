public class Questao03 {

    public static void main(String[] args) {
        System.out.println(fatorial(12));
    }
    public static String fatorial(int x) {

        if (x ==0){
            return "0";

        } else if (x ==1 ) {
            return "1";
        }
        String fat = ""+fatorial(x/2)+(x%2);
        return fat;
    }
}
