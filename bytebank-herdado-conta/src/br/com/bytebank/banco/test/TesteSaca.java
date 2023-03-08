package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
    public static void main(String[] args) {

        Cliente ricard = new Cliente();
        ricard.setNome("Ricard Roberg");

        ContaCorrente cc = new ContaCorrente(1337, 14534);

        cc.setTitular(ricard);
        cc.deposita(200.0);
        try {
            cc.saca(210.0);
        } catch (SaldoInsuficienteException err) {
            System.out.println("Ex: " + err.getMessage());
        }

        System.out.println("Saldo: " + cc.getSaldo());
    }
}
