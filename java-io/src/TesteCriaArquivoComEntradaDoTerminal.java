import java.io.*;
import java.net.Socket;

public class TesteCriaArquivoComEntradaDoTerminal {
    public static void main(String[] args) throws IOException {

        // Fluxo de Copia de Arquivo
        InputStream fis = System.in;
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("lorem_TesteCriaArquivoComEntradaDoTerminal.txt"); // System.ou para saida direta no terminal
        Writer osr = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osr);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush(); // para fazer a imediata saida dos dados em vez de guardar em buffer

            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
