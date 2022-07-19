
package com.mycompany.aula5;

public class Aula5 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(111);
        p1.setDono("Jubileu");
        p1.abrirConta("cp");
        p1.gerarExtrato();
    }
}
