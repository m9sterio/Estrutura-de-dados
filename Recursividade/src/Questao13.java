public class Questao13 {

    public static void main(String[] args) {
        String palavra = "engenharia de software";
        char letra = 'a';

        int total = contaOcorrencias(palavra, letra, 0);
        System.out.println("A letra '" + letra + "' aparece " + total + " vez(es) em \"" + palavra + "\"");
    }
    public static int contaOcorrencias(String texto, char alvo, int indice) {
        if (indice == texto.length()) {
            return 0;
        }
        int contador = (texto.charAt(indice) == alvo) ? 1 : 0;
        return contador + contaOcorrencias(texto, alvo, indice + 1);
    }

}
