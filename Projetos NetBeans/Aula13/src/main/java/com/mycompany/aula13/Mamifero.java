package com.mycompany.aula13;
public class Mamifero extends Animal {
    protected String corPelo;
    
    @Override
    public void emitirSom() {
        System.out.println("Som do mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
