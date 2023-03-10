package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Ricard Roberg");
        cliente.setProfissao("Developer");
        cliente.setCpf("123.456.789.-00");

        ContaCorrente cc1 = new ContaCorrente(1337, 4423220);
        cc1.deposita(250.0);
        cc1.setTitular(cliente);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc1);
        oos.close();

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto2.bin"));
//        Cliente cliente = (Cliente) ois.readObject();
//        ois.close();
//        System.out.println(cliente.toString());

    }
}
