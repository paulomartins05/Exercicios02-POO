package br.inatel.poo.turmas;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calculaMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Média: " + calculaMedia());
        System.out.println("-------------------------");
    }

    public String getNome() {
        return nome;
    }
}