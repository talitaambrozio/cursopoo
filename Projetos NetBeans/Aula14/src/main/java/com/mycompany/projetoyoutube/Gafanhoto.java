package com.mycompany.projetoyoutube;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totalAssistido;

    public void viuMaisUm(){
     this.setTotalAssistido(this.getTotalAssistido()+1);
    }
    
    public Gafanhoto(String nome, int idade, String sexo, String login){//construtor
        super(nome,idade,sexo);
        this.login = login;
        this.totalAssistido = 0;
    }
    
    @Override
    public void ganharExp() {
        this.experiencia++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totalAssistido=" + totalAssistido + '}';
    }
    
}
