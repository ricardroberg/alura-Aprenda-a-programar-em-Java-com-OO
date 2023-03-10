import java.io.*;
import java.net.Socket;

public class TesteEntradaSocket {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket(); // Trabalha em conjunto com outra ponta

        InputStream fis = s.getInputStream();
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = s.getOutputStream(); // System.ou para saida direta no terminal
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
