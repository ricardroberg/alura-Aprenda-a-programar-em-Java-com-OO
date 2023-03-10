import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        // Fluxo de Saida com Arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osr = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osr);

        FileWriter fw = new FileWriter("lorem_TesteEscrita2.txt"); // ou
//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem_TesteEscrita2.txt")); // indicado o uso
        BufferedWriter bw = new BufferedWriter(fw); // indicado o uso


        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//        fw.write(System.lineSeparator());
        bw.newLine();
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");

        bw.close();
    }
}
