package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        // Sem sobrepor o método toString
        // [br.com.alura.Aula@1b6d3586, br.com.alura.Aula@4554617c, br.com.alura.Aula@74a14482]
        // Após sobrepor
        // [[Aula: Revisitando as ArrayLists, 21 minutos.], [Aula: Listas de objetos, 15 minutos.], [Aula: Relacionamento de listas e objetos, 15 minutos.]]

        Collections.sort(aulas); // metodo compareTo @Override na classe Aula
        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo)); //  mesmo efeito da linha de cima.
        System.out.println(aulas);
    }
}
