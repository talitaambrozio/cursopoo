package com.mycompany.aula02b;
public class Caneta {   
    //criação dos atributos
    String modelo, cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //criação dos métodos
    void rabiscar(){ //obs: void significa que o método não tem retorno
       if(this.tampada == true){
           System.out.println("Erro! Não posso rabiscar!");
       } else
            System.out.println("Estou rabiscando.");
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada?" + this.tampada);
        System.out.println("Modelo " + modelo);
        System.out.println("Carga " + carga);
    }    
}
