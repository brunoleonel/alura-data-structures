package br.com.alura.datastructures.vector;

import br.com.alura.datastructures.objects.Aluno;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
        garanteEspaco();
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno) {

        garanteEspaco();
        for (int i = totalDeAlunos - 1; i >= posicao; i -= 1) {
            alunos[i + 1] = alunos[i];
        }

        alunos[posicao] = aluno;
        totalDeAlunos++;
    }

    public Aluno pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return alunos[posicao];
    }

    private void garanteEspaco() {
        if (totalDeAlunos == alunos.length) {
            Aluno[] novoArray = new Aluno[totalDeAlunos * 2];
            for (int i = 0; i < alunos.length; i++) {
                novoArray[i] = alunos[i];
            }
            alunos = novoArray;
        }
    }

    public void remove(int posicao) {

        for (int i = posicao; i < totalDeAlunos - 1; i++) {
            alunos[i] = alunos[i + 1];
        }

        totalDeAlunos--;
        alunos[totalDeAlunos] = null;
    }

    public boolean contem(Aluno aluno) {

        for (int i = 0; i < totalDeAlunos; i++) {
            if (alunos[i] != null && alunos[i].equals(aluno)) {
                return true;
            }
        }

        return false;
    }

    public int tamanho() {
        return totalDeAlunos;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}
