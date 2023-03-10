package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.*;

public class TesteArrayList {
    public static void main(String[] args) {

        // <> Generics
        ArrayList<Conta> lista1 = new ArrayList<Conta>();
        LinkedList<Conta> lista2 = new LinkedList<Conta>();
        List<Conta> lista3 = new ArrayList<Conta>();
        List<Conta> lista4 = new Vector<>();
        Collection<Conta> lista5 = new ArrayList<>(); // alguns métodos não vão funcionar

        Conta cc1 = new ContaCorrente(1337, 113322);
        lista1.add(cc1);

        Conta cc2 = new ContaCorrente(1337, 111323);
        lista1.add(cc2);

        System.out.println("Tamanho: " + lista1.size());

        Conta ref = lista1.get(0);
        System.out.println(ref.getNumero());

        lista1.remove(0);
        System.out.println("Tamanho: " + lista1.size());

        Conta cc3 = new ContaCorrente(1337, 111111);
        lista1.add(cc3);

        Conta cc4 = new ContaCorrente(1337, 222222);
        lista1.add(cc4);

        for (int i = 0; i < lista1.size(); i++) {
            Object oRef = lista1.get(i);
            System.out.println(oRef.toString());
        }

        System.out.println("**********************");

        for (Conta oRef : lista1) {
            System.out.println(oRef.toString());
        }

    }
}
