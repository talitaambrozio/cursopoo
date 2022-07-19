package com.mycompany.aula11;
public class Aula11 {

    public static void main(String[] args) {
        
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(18);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Contabilidade");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1113);
        b1.setNome("Maria");
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade();
    }
}
