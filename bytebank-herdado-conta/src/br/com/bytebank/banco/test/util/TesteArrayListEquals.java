package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

//        Conta cc1 = new ContaCorrente(1337, 113322);
//        Conta cc2 = new ContaCorrente(1337, 111323);
//
//        boolean igual = cc1.jaExiste(cc2);
//        System.out.println("Conta CC1 existe: " + igual);


        // <> Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(1337, 113322);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(1337, 111323);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(1337, 111323);
//        lista.add(cc3);

        boolean existe1 = lista.contains(cc1);
        System.out.println("Existe? " + existe1);

        boolean existe2 = lista.contains(cc3);
        System.out.println("Existe? " + existe2);

        for (Conta oRef : lista) {
            System.out.println(oRef.toString());
        }

    }
}
