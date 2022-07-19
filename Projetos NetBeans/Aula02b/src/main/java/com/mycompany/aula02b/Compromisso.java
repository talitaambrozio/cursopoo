
package com.mycompany.aula02b;

public class Compromisso {
    
    //atributos
    String data, horario, local; 
    boolean agendado, presenca;
    
    //métodos
    void agendar(){
        this.agendado = true;
    }
    void comparecer(){
        this.presenca = true;
    }
    void desmarcar(){
        this.agendado = false;
    }
    void faltar(){
        this.presenca = false;
    }
    void status(){
        System.out.println("Compromisso: " + local);
        System.out.println("Data: " +  data);
        System.out.println("Horario: " + horario);
        System.out.println("Agendamento confirmado? ");
        if(agendado == true){
            System.out.print("Sim");
        }else{
            System.out.print("Nao");
        }
                
    }
}
