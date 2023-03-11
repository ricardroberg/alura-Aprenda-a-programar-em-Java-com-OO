package br.com.alura;

import java.util.*;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
//        javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));

        // Forma anterior
//        for (Aluno a : javaColecoes.getAlunos()) {
//            System.out.println(a);
//        }

        // For mais antiga
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
//        iterador.hasNext(); ou  iterador.next();
        while (iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }
//        Aluno depoisDoUltimo = iterador.next(); // .NoSuchElementException

        Vector<Aluno> vetor = new Vector<>(); // bem legado

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("E esse Turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("O a1 é equals a turini? (método equals @Override");
        System.out.println(a1.equals(turini));

        System.out.println("O Hash do a1 é igual a turini?");
        System.out.println(a1.hashCode() == turini.hashCode());
    }
}
