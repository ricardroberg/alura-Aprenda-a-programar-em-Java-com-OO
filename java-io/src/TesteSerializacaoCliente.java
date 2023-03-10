import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Ricard Roberg");
//        cliente.setProfissao("Developer");
//        cliente.setCpf("123.456.789.-00");
//
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto2.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto2.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.toString());

    }
}
