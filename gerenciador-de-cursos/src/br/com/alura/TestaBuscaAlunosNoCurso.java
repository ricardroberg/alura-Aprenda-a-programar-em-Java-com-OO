package br.com.alura;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        Aluno a4 = new Aluno("Paulo Silveira", 5617);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println(javaColecoes.getAlunos());
        System.out.println("Quem é o aluno com matrívula 5617?");
        Aluno aluno = javaColecoes.buscaAlunoPelaMatricula(5617); //HashMap sobrepoe valores de chaves iguais
        System.out.println("Aluno: " + aluno);
    }

}
