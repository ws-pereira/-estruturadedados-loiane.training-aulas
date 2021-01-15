package br.wspereira.estruturadados.vetor.teste;

import br.wspereira.estruturadados.vetor.Vetor;

public class Aula5 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");
        vetor.adiciona("Elemento 5");

        System.out.println(vetor.toString());

        System.out.println(vetor.busca(2));

    }
}
