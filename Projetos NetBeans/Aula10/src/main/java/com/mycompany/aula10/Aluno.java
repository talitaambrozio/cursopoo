package com.mycompany.aula10;
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private boolean statusMatricula;
    
    
    public void cancelarMatricula(){
        this.statusMatricula = false;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(boolean statusMatricula) {
        this.statusMatricula = statusMatricula;
    }
    
}
