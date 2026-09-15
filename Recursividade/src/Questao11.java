public class Questao11 {
    public static void main(String[] args) {
        System.out.println(inverter("pinto"));

    }

    public static String inverter(String palavra) {
        char umaLetra = (palavra.charAt(palavra.length()-1));
        if (palavra.length()<=1){
            return palavra;
        }
        if (palavra.equals(umaLetra)){

            return String.valueOf(umaLetra);
        }
            String ultimaPalavra = String.valueOf(palavra.charAt(palavra.length()-1));
        return ultimaPalavra + inverter(palavra.substring(0,palavra.length()-1));

    }
}
