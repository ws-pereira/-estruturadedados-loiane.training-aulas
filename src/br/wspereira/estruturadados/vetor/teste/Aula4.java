/* Imprimindo todos os elementos, adicionado no vetor
   Trabalhando com StringBuilde
 */

package br.wspereira.estruturadados.vetor.teste;

import br.wspereira.estruturadados.vetor.Vetor;


public class Aula4 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        System.out.println("Tamanho inicial do vetor - "+vetor.getTamanho());
        System.out.println("Adicionando elementos...");

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        System.out.println("Tamanho final do vetor - "+vetor.getTamanho());
        System.out.println("Elementos adicionados \n"+vetor);
    }




}
