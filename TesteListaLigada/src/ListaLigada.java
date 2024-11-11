/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class ListaLigada {

    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor) {
        Elemento novoElemento = new Elemento(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public void remover(String valorProcurado) {
        Elemento anterior  = null; //começa null pq ele inicializa no primeiro (que nao tem como ter anterior)
        Elemento atual = this.primeiro; // ele inicializa no primeiro para começar a varrer
        for (int i=0; i<this.getTamanho(); i++){
            if(atual.getValor().equalsIgnoreCase(valorProcurado)){
                if(atual == primeiro && atual  == ultimo){ //quando exisitr apenas um elemento
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == primeiro ){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null); //so pra dizer que nao existe ligação com o anterior 
                }else if(atual == ultimo){
                    this.ultimo = anterior; // transformou o penultimo em ultimo 
                    anterior.setProximo(null); // declarou que o novo ultimo nao tem proximo
                    
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho --;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }        
                
    }

    public Elemento get(int posicao) {
        Elemento atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
            
        }
        return atual;
    }

}
