import java.util.ArrayList;

public class Questao12 {


    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        int soma = somaArray(numeros, 0);
        System.out.println("A soma dos elementos do array é: " + soma);
    }
    public static int somaArray(int[] array, int indice) {
        if (indice == array.length) {
            return 0;
        }
        return array[indice] + somaArray(array, indice + 1);
    }

}
