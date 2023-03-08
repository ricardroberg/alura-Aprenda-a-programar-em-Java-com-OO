public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma += boni;
        System.out.println("BONIFICACAO: " + this.soma);
    }

    public double getSoma() {
        return soma;
    }
}
