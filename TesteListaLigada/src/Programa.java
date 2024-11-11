/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("NY");
        System.out.println("O tamanho da lista " + lista.getTamanho());
        System.out.println("Primeiro " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo " + lista.getUltimo().getValor());
        for(int i = 0; i<lista.getTamanho();i++){
            System.out.println(lista.get(i).getValor()); 
        }
        //REMOVER ELEMENTO NY  E DEPOIS TODOS OS ELEMENTOS E DEPOIS ADD E VERIFICAR SE O TAMANHO AUMENTA
        lista.remover("ny");
        System.out.println("Item removido");
         lista.adicionar("SP");
         System.out.println("ADD estado SP ");
         lista.remover("ac");
         lista.remover("ba");
         lista.remover("sp");
         //ADD ULTIMA VEZ
         lista.adicionar("RJ");
         
         System.out.println("Tamanho : " + lista.getTamanho()); // VERIFICAR O TAMANHO
        for(int i = 0; i<lista.getTamanho();i++){
            System.out.println(lista.get(i).getValor()); 
        }
        
       
        

        
        
        
    }
    
}
