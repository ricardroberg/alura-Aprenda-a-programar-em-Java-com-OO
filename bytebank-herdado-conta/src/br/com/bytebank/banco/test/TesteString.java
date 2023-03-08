package br.com.bytebank.banco.test;

import java.util.Locale;

public class TesteString {
    public static void main(String[] args) {

        String nome = "Alura"; // Object literal
//        String outro = new String("Alura"); // Sintaxe formal

        char c = 'A'; // ùnico caracter, aspas simples
        char d = 'a';


// Immutabilidade da String
//-------------------------------------------------------------------
        nome.replace("A", "a"); // Alura
        nome.toLowerCase(); // Alura
//-------------------------------------------------------------------

        System.out.println(nome.charAt(2)); // u
        System.out.println(nome.indexOf("ur"));  // 2
        System.out.println(nome.substring(1)); // lura
        System.out.println(nome.length()); // 5

        String novoNome = nome.replace(c, d);
        String novoNome2 = nome.replace("Al", "aL");
        String outroNome = nome.toUpperCase();

        System.out.println(nome); // Alura
        System.out.println(novoNome); // alura
        System.out.println(novoNome2); // aLura
        System.out.println(outroNome);  // ALURA

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
        String vazio = "";
        String naoVazio = " ";
        String resolveNaoVazio = "                Alura                   ";
        System.out.println(vazio.isEmpty()); // true
        System.out.println(naoVazio.isEmpty()); // false
        System.out.println(resolveNaoVazio.trim()); // Alura
        System.out.println(resolveNaoVazio.contains("Alu")); // true

        /**
         * O que é?
         * Visibilidade? Acesso?
         * Pacote?
         *
         * public class System{
         *  public static <referencia> out;
         *  }
         *
         *
         *  System
         *   - classe, java.lang, acesso público (public)
         *  out
         *   - atributo, publico, referência, static
         * println
         *   - método, publico, não static, sobrecarga, não joga excessões tipo checked
         */
    }
}
