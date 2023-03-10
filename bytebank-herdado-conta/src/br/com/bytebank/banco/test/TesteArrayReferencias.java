package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {

//        Object[] referencias = new Object[5];
        Conta[] referencias = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(1337, 999999);
        Cliente ricard = new Cliente();
        ricard.setNome("Ricard Roberg");

        ContaPoupanca cp2 = new ContaPoupanca(1337, 999999);
        Cliente henrik = new Cliente();
        henrik.setNome("Henrik Roberg");

        ContaCorrente cc3 = new ContaCorrente(1337, 123123);
        Cliente fulano = new Cliente();
        fulano.setNome("Fulano da Silva");

        referencias[0] = cc1;
        referencias[0].setTitular(ricard);
        referencias[0].deposita(150.0);

        referencias[1] = cp2;
        referencias[1].setTitular(henrik);
        referencias[1].deposita(250.0);

        referencias[2] = (ContaCorrente) cc3;
        referencias[2].setTitular(fulano);
        referencias[2].deposita(50.0);

//        System.out.println(referencias.length);

//        Conta referencia = referencias[2] ; // SEM CAST
        ContaCorrente referencia = (ContaCorrente) referencias[2]; // type CAST

        System.out.println(referencias[0].toString());
        System.out.println();
        System.out.println(referencias[1].toString());
        System.out.println();
        System.out.println(referencia.toString());


    }
}
