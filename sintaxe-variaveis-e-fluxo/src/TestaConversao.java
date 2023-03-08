public class TestaConversao {
    public static void main(String[] args){
        double salario = 1800.00;

//        float pontoFlutuante = 3.14f;

        int valor = (int) salario;

        System.out.println(valor);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total); // 0.30000000000000004

//        int => 2bilhoes;
//        long => 2^63
//        short => 16bits -1
//        byte = 8bits -1
    }
}
