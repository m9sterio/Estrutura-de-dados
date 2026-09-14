/* Escreva uma função recursiva que determine se uma string é um palíndromo.
A função deve ignorar espaços e diferenças entre maiúsculas e minúsculas.
 */

public class Questao07 {
    public static void main(String[] args) {
        System.out.println(palíndromo("Radar"));
    }
    public static String palíndromo(String palavra) {
        String a =  String.valueOf(palavra.charAt(0));
        String b = String.valueOf( palavra.charAt(palavra.length()-1));

        if (palavra.length()<=1){
            return "é palíndromo";
        }
        int i=palavra.length();
        int j = i+0;
        String x = palavra.substring(0,i);
        if (!a.equalsIgnoreCase(b)){
            return "não é palíndromo";
        }
        return palíndromo(palavra.substring(1,palavra.length()-1));

    }

}
