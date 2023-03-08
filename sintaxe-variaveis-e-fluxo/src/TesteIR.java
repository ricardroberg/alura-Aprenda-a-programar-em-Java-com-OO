public class TesteIR {

    public static void main(String[] args) {

        double salario = 1100.0;
        double deducao = 0.0;
        double aliquota = 0.0;

        if (salario >=1900.00 && salario <= 2800.00) {
            deducao = 142.00;
            aliquota = 7.5;
        } else if (salario >= 2800.01 && salario <= 3751.00) {
            deducao = 350.00;
            aliquota = 15;
        } else if (salario >= 3751.01 && salario <= 4664.00) {
            deducao = 636.00;
            aliquota = 22.5;}
        System.out.println("Aliquto de " + aliquota + "%");
        System.out.println("Valor da dedução é de R$ " + deducao);
    }
}
