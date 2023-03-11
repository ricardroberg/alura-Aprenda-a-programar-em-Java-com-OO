package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>(); // Set não aceita elementos repetidos e não possui ordem nem indice
        alunos.add("Rodrigo Turini");
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Renan Saggio");
        alunos.add("Renan Saggio");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        alunos.forEach(aluno -> System.out.println(aluno));
        alunos.remove("Sergio Lopes");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);
    }
}
