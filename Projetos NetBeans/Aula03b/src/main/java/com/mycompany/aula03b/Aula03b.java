
package com.mycompany.aula03b;


public class Aula03b {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        //c1.tampada = false;
        c1.carga = 80;
        c1.status();
        c1.rabiscar();
        
    }
}
