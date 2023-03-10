package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeReferencias {
    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc1 = new ContaCorrente(1337, 113322);
        guardador.adiciona(cc1);

        Conta cc2 = new ContaCorrente(1337, 113322);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeContas();
        System.out.println("QUANTIDADE DE CONTAS: " + tamanho);

        Conta ref = (Conta) guardador.getContaPelaReferencia(0);
        System.out.println(ref.toString());

    }
}
