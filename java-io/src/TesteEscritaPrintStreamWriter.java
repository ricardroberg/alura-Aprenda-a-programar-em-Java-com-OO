import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamWriter {
    public static void main(String[] args) throws IOException {

        // Fluxo de Saida com Arquivo
//        OutputStream fos = new FileOutputStream("lorem_TesteEscrita3.txt");
//        Writer osr = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osr);

//        PrintStream ps = new PrintStream(new File("lorem_TesteEscrita3.txt"));

        PrintWriter ps = new PrintWriter("lorem_TesteEscrita3-1.txt");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");

        ps.close();
    }
}
