public class Questao14 {
    public static void main(String[] args) {
        int[] numeros = {12, 45, 3, 89, 27, 6};
        System.out.println("O maior elemento é: " + maior(numeros, 0));
    }
    public static int maior(int[] array, int indice) {
        // Caso base: último elemento
        if (indice == array.length - 1) {
            return array[indice];
        }

        int maiorResto = maior(array, indice + 1);
        return Math.max(array[indice], maiorResto);
    }

}
