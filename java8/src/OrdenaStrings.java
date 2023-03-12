import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        // ou
        palavras.sort((s1, s2) -> s1.length() - s2.length());
        //Mais expressivo
        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));

        System.out.println(palavras);

        Consumer<String> impressor = s -> System.out.println(s);
        Consumer<String> impressor2 = System.out::println;
        palavras.forEach(impressor);
        palavras.forEach(a -> System.out.println(a));
        
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }

    // IF ANTIGO
//        if(s1.length() < s2.length()){
//            return -1;
//        }
//        if(s1.length() > s2.length()){
//            return 1;
//        }
//
//        return 0;
//    }
}