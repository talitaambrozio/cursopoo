package com.mycompany.aula7;
public class Aula7 {

    public static void main(String[] args) {
     Lutador L [] = new Lutador[6];
     L[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
     L[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2 ,3);
     L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
     L[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0 , 2);
     L[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
     L[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
     L[0].status();
     L[1].status();
     L[3].status();
     L[4].status();
     L[5].status();
     
     
     
    Luta UEC01 = new Luta();
    UEC01.marcarLuta(L[1], L[1]);
    UEC01.lutar();
    L[0].status();
    L[1].status();
    }
}
