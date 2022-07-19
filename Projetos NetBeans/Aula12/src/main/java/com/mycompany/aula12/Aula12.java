package com.mycompany.aula12;
public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru cang = new Canguru();
        Cachorro cach = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tart = new Tartaruga();
        Goldfish gold = new Goldfish();
        Arara ara = new Arara();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.emitirSom();
        m.locomover();
        
        a.alimentar();
        a.emitirSom();
        a.locomover();
        cang.locomover();
        cach.emitirSom();
    }
}
