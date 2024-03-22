import java.lang.String;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    //retorna a string digitada quando não nula ou não vazia
    public static boolean stringValida(String texto) {
        return texto != null && !texto.isEmpty();
    }

    //verifica se a string digitada é ou não palíndromo, comparando o primeiro com o último caracter, o segundo com o penúltimo...
    public static boolean palindromo(String texto) {
        if(stringValida(texto)) {
            for (int i = 0, j = texto.length()-1; i<j; i++, j--){
                if (texto.charAt(i) != texto.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    //cria um mapa, verifica os caracteres e conta a quantidade de cada um
    public static void contaCaracter(String texto) {

        //criando um hashmap onde a chave é o caracter e o valor é a quantidade que ele aparece na palavra
        HashMap<Character, Integer> contaCaracterMapa = new HashMap<Character, Integer>();

        //transforma String em array de char
        char[] textoArray = texto.toCharArray();

        //verifica os caracteres do array e alimenta o mapa
        for (char c : textoArray) {
            if (contaCaracterMapa.containsKey(c)) {
                contaCaracterMapa.put(c, contaCaracterMapa.get(c)+1);
            } else {
                contaCaracterMapa.put(c, 1);
            }
        }

        //imprime os caracteres e quantidade que ocorre
        for (Map.Entry entrada : contaCaracterMapa.entrySet()) {
            System.out.print(entrada.getKey() + ":" + entrada.getValue() + ",");
        }
    }


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String texto;

        System.out.println("Escreva uma palavra:");
        texto = ler.nextLine();

        if(stringValida(texto)) {
            System.out.println("palindromo: " + palindromo(texto));
            System.out.print("ocorrencias_caracteres: {");
            contaCaracter(texto);
            System.out.print("}");
        } else {
            System.out.println("Palavra inválida!");
        }





    }
}