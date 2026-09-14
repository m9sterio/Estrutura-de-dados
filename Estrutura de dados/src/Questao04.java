import javax.swing.*;

public class Questao04 {
    public static void main(String[] args) {
        System.out.println(Numero(200));
    }
    public static int Numero(Integer x) {

        String conversao = String.valueOf(x).substring(x);


        return Numero(Integer.valueOf(conversao));
    }
}
