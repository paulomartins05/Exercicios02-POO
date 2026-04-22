package br.inatel.poo.turmas;

public class Turma {
    private int quantidadeAlunos;
    private Aluno[] alunos;

    public Turma(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
        this.alunos = new Aluno[quantidadeAlunos];
    }

    public void adicionarAluno(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                System.out.println("Aluno adicionado com sucesso!");
                return;
            }
        }
        System.out.println("Turma cheia!");
    }

    public void listarAlunos() {
        System.out.println("--- Listagem de Alunos ---");
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                aluno.mostraInfo();
            }
        }
    }

    public Aluno buscarMelhorAluno() {
        Aluno melhor = null;
        double maiorMedia = -1;

        for (Aluno aluno : alunos) {
            if (aluno != null) {
                double mediaAtual = aluno.calculaMedia();
                if (mediaAtual > maiorMedia) {
                    maiorMedia = mediaAtual;
                    melhor = aluno;
                }
            }
        }
        return melhor;
    }
}