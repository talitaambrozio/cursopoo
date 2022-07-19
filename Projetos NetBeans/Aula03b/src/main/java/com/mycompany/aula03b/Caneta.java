package com.mycompany.aula03b;
public class Caneta {   
    //criação dos atributos
    public String modelo, cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    //criação dos métodos
    public void rabiscar(){ //obs: void significa que o método não tem retorno
       if(this.tampada == true){
           System.out.println("Erro! Não posso rabiscar!");
       } else
            System.out.println("Estou rabiscando.");
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada?" + this.tampada);
        System.out.println("Modelo " + this.modelo);
        System.out.println("Carga " + this.carga);
    }    
}
