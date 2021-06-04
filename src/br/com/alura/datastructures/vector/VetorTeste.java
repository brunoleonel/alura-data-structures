package br.com.alura.datastructures.vector;

import br.com.alura.datastructures.objects.Aluno;

public class VetorTeste {

    public static void main(String[] args) {
        var aluno1 = new Aluno("João");
        var aluno2 = new Aluno("José");

        var lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adiciona(aluno1);
        System.out.println(lista.tamanho());
        lista.adiciona(aluno2);
        System.out.println(lista.tamanho());

        System.out.println(lista);

        System.out.println(lista.contem(aluno2));

        var aluno3 = new Aluno("Gabriel");

        System.out.println(lista.contem(aluno3));

//        var alunoX = lista.pega(102);
//        System.out.println(alunoX);

        lista.remove(1);
        System.out.println(lista);

        for (int i = 0; i < 300; i++) {
            Aluno y = new Aluno(String.format("%s %d", "João", i));
            lista.adiciona(y);
        }

        System.out.println(lista);
    }
}
