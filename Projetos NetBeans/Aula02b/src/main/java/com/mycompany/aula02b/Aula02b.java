
package com.mycompany.aula02b;


public class Aula02b {

    public static void main(String[] args) {
        
        /*Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        
        c1.destampar();
        c1.status();
        c1.rabiscar();*/
        
        /*Cola cola1 = new Cola();
        cola1.cor = "Branca";
        cola1.tamanho = "8g";
        cola1.marca = "Scotch";
        cola1.tampada = true;
        
        cola1.colar();
        cola1.estado();*/
        
        Compromisso medico = new Compromisso();
        medico.data = "26/07";
        medico.horario = "8am";
        medico.local = "clinica medica";
        medico.agendar();
        medico.status();
        
        
       
        
    }
}
