// Aula 02 do curso Loiane.training

package br.wspereira.estruturadados.vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int getTamanho(){
        return tamanho;
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
            throw new Exception("Vetor cheio. Não é possivel adiconar novo elemento.");
        }
    }*/

    public boolean adiciona(String elemento)  {
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        for(int x = 0; x < this.tamanho ; x++){
            str.append(this.elementos[x]);
            str.append(", ");
        }

        if(this.tamanho > 0){
            str.append(this.elementos[this.tamanho]);
        }

        str.append(" ]");
        return str.toString();
    }
}
