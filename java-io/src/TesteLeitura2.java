import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("contas2.csv"), "UTF-8");

        while (sc.hasNext()) {
            String linha = sc.nextLine();
//            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numeroConta = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

//            String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%08d %15s: %08.2f", tipoConta, agencia, numeroConta, titular, saldo);
            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d %15s: %08.2f %n", tipoConta, agencia, numeroConta, titular, saldo);
//            System.out.println(valorFormatado);
//            System.out.println(valor1 + " / " + valor2 + " / " + valor3 + " / " + valor4 + " / " + valor5);


            linhaScanner.close();
//            String[] valores = linha.split(",");
//            System.out.println(valores[3]);

        }
        sc.close();
    }
}
