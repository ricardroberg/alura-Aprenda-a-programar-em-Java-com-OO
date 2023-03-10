package br.com.bytebank.banco.modelo;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Classe representa a moldura de uma conta
 *
 * @author: Ricard Roberg
 */


public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

    private static int total = 0;
    protected double saldo;
    private int agencia;
    private int numero;
    private transient Cliente titular; // não faz parte da serialização então classe Cliente não precisa implementar Serializable

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero
     *
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero) {
        Conta.total++;
//        System.out.println("O Total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
//        this.saldo = 100;
//        System.out.println("Estou criando a conta: " + this.numero);
    }

    public static int getTotal() {
        return Conta.total;
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior que o saldo
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {


        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        System.out.println("Transferindo R$ " + valor + " para a conta " + destino.getNumero());
        destino.deposita(valor);

    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (agencia <= 0) {
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgecia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;

        if (this.agencia != outra.agencia && this.numero != outra.numero) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Conta cc) {
        return Double.compare(this.saldo, cc.saldo);
    }

    @Override
    public String toString() {
        if (this.getTitular() != null) {
//            return "Agencia: " + this.getAgencia() + "\nNumero: " + this.getNumero() + "\nTitular: " + this.getTitular().getNome() + "\nSaldo: R$" + this.getSaldo();
            return "Agencia: " + this.getAgencia() + "\tNumero: " + this.getNumero() + "\tTitular: " + this.getTitular().getNome() + "\tSaldo: R$" + this.getSaldo();
        } else {
//            return "Agencia: " + this.getAgencia() + "\nNumero: " + this.getNumero() + "\nTitular: Nao Atribuido" + "\nSaldo: R$" + this.getSaldo();
            return "Agencia: " + this.getAgencia() + "\tNumero: " + this.getNumero() + "\tTitular: Nao Atribuido" + "\tSaldo: R$" + this.getSaldo();
        }
    }
}
