public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 24226);
        System.out.println(conta.getAgencia());

        conta.setAgecia(1442);
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 24229);
        Conta conta3 = new Conta(1337, 24233);

        System.out.println("O total de contas é: " + Conta.getTotal());
    }
}
