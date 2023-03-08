package br.com.bytebank.banco.test;


import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaEspecial ce = new ContaEspecial(1339, 444444);
        ce.getSaldo();

        ContaCorrente cc = new ContaCorrente(1337, 145312);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(1338, 123123);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

        cc.saca(10.00);
        System.out.println("CC: " + cc.getSaldo());
    }
}
