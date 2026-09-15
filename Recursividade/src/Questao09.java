public class Questao09 {

    public static void main(String[] args) {
        System.out.println(potenciao(5,3));

    }

    public static int potenciao(int x,int y) {

        if (y==1){
            return x;
        }

        return x* potenciao(x,y-1);
    }
}
