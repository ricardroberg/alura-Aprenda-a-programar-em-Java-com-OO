public class TesteFuncionario {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Gerente ricard = new Gerente();
        ricard.setNome("Ricard Roberg");
        ricard.setCpf("999.888.777-66");
        ricard.setSalario(1800.00);

        System.out.println(ricard.getNome());
        System.out.println(ricard.getBonificacao());
    }
}
