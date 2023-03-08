public class TesteGerente {
    public static void main(String[] args) {

        Autenticavel referencia = new Gerente();

        Gerente g1 = new Gerente();
        g1.setNome("Henrik Roberg");
        g1.setSalario(5000.0);
        g1.setCpf("123.456.789-00");

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        System.out.println(g1.getBonificacao());
        System.out.println(g1.autentica(2222)); // false
        g1.setSenha(2222);
        System.out.println(g1.autentica(2222)); // false
    }
}
