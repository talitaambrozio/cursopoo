
package com.mycompany.aula02b;

public class Cola {
    
    //atributos:
    String marca, cor, tamanho;
    boolean tampada;
    
    //métodos:
    void colar(){
        if(this.tampada == false){
        System.out.println("Colando...");
        }else{
            System.out.println("Não posso colar pois estou tampada!");
        }
    }
    void tampada(){
        this.tampada = true;
    }
    void destampada(){
        this.tampada = false;
    }
    void estado(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    
    
}
