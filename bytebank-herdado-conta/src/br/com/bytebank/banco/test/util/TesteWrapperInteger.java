package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        int[] valores = new int[5]; // primeira array que vimos
        String[] nomes = new String[5]; // valores primitivos e referencias

        List numeros = new ArrayList(); // Outros tipos de listas / somente lista e coleções de referências

        int idade = 29; // tipo primitivo - Integer
        Integer idadeRef = Integer.valueOf(29); // como é feito por baixo dos panos
        int valor = idadeRef.intValue();

        System.out.println("TO DOUBLE: " + idadeRef.doubleValue());

        System.out.println("INTEGER MAX VALUE: " + Integer.MAX_VALUE);
        System.out.println("INTEGER MIN VALUE: " + Integer.MIN_VALUE);
        System.out.println("INTEGER SIZE: " + Integer.SIZE);
        System.out.println("INTEGER BYTES: " + Integer.BYTES);

        String s = "10"; // 10 vira "10"

        System.out.println(Integer.valueOf(s));
        System.out.println(Integer.parseInt(s));

//        System.out.println(numeroArgs);


        List<Integer> idades = new ArrayList<Integer>(); // adiciona referências.
        idades.add(29); // Autoboxing (cria automaticamente a referência)
        idades.add(idade); // ou
        idades.add(idadeRef);
    }
}
