public class TestaValores {
    public static void main(String[] args) {

        int primeiro = 5;
        int segundo = 7;

        segundo = primeiro;
        primeiro = 10;

        System.out.println(segundo);  // não referencia a variável e sim o seu valor no momento da atribuição
    }
}
