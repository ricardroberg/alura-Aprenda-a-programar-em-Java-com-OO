package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {

        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(1337, 145678);
        ContaPoupanca cp = new ContaPoupanca(1337, 945678);
        Cliente cliente = new Cliente();
        cliente.setNome("Ricard Roberg");
        cc.setTitular(cliente);
        cp.setTitular(cliente);

        System.out.println(cc.toString());
        System.out.println();
        System.out.println(cp.toString());

        println();
        println(3);
        println(true);
        println(cc);
        println(cliente);
    }

    static void println() {
    }

    static void println(int a) {
    }

    static void println(boolean valor) {
    }

    static void println(Object referencia) {
    }
}
