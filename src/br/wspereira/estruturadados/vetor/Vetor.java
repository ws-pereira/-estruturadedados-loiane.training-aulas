// Aula 02 do curso Loiane.training

package br.wspereira.estruturadados.vetor;

public class Vetor {

    private String[] elementos;
    private int tamanhho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanhho = 0;
    }

    /* public void adiciona(String elemento){
        for (int x = 0; x < this.elementos.length;x++) {
            if(this.elementos[x] == null){
                this.elementos[x] = elemento;
                break;
            }
        }
    }*/

    /*public void adiciona(String elemento) throws Exception {
        if(this.tamanhho < this.elementos.length){
            this.elementos[this.tamanhho] = elemento;
            this.tamanhho++;
        }
        else {
            throw new Exception("Vetor cheio, e não é possivel adiconar novo elemento.");
        }
    }*/

    public boolean adiciona(String elemento) throws Exception {
        if(this.tamanhho < this.elementos.length){
            this.elementos[this.tamanhho] = elemento;
            this.tamanhho++;
            return true;
        }
        return false;
    }

}
