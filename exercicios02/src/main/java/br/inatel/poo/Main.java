package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {

        Turma minhaTurma = new Turma(5);


        double[] notas1 = {8.5, 7.0, 9.0};
        Aluno a1 = new Aluno("João Silva", "101", notas1);

        double[] notas2 = {6.0, 5.5, 4.0};
        Aluno a2 = new Aluno("Maria Oliveira", "102", notas2);

        double[] notas3 = {10.0, 9.5, 10.0};
        Aluno a3 = new Aluno("Pedro Santos", "103", notas3);

        minhaTurma.adicionarAluno(a1);
        minhaTurma.adicionarAluno(a2);
        minhaTurma.adicionarAluno(a3);

        System.out.println("-*-*--*-*-*--*-*-*--*-*-*--*");
        minhaTurma.listarAlunos();

        System.out.println("-*-*--*-*-*--*-*-*--*-*-*--*");
        Aluno melhor = minhaTurma.buscarMelhorAluno();

        if (melhor != null) {
            System.out.println("Melhor Aluno: " + melhor.getNome());
            System.out.println("Média: " + melhor.calculaMedia());
        }
    }
}