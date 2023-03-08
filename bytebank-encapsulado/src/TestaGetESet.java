import java.util.Locale;

public class TestaGetESet {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Conta conta = new Conta(1337, 24226);
        // conta.numero = 1337
//        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
//        conta.titular = paulo; // titular é atributo privado da classe Conta
        paulo.setNome("Paulo Silveira");

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        // DE OUTRA FORMA
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());

    }
}
