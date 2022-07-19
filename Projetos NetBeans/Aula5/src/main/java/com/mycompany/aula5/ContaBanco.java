
package com.mycompany.aula5;

public class ContaBanco {
    public  int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    
    public void abrirConta(String t){
        this.setStatus(true); //status conta aberta recebe verdadeira
        this.setTipo(t); //tido da conta
        
        if ("cp".equals(t)){ // se o tipo (t) for igual a cp
            this.saldo = 150.0f;
        }else if ("cc".equals(t)){
            this.saldo = 50.0f;
        } 
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (status == true){
            if(this.getSaldo() < 0 || this.getSaldo() > 0.0f){
                System.out.println("Nao e possivel fechar conta com saldo diferente de 0.0");
            }else{
                this.setStatus(false);  
                System.out.println("A conta " + this.getNumConta() + " do titular " + this.getDono() + " foi fechada com sucesso!");
            }
        }
    }
    public void depositar(float dep){
        if(this.getStatus()){ //se o status for verdadeiro
            this.setSaldo(this.getSaldo()+dep);
            System.out.println("Deposito no valor de R$" + dep + " efetuado com sucesso!");
        }else{
            System.out.println("Nao e possivel depositar em conta encerrada.");
        }
    }
    public void pagarMensalidade(){
        if(this.getStatus()){
            if(this.getTipo() == "cc"){
              this.saldo = saldo - 12.0f;   
                System.out.println("Mensalidade de R$12,00 paga com sucesso.");
            }else if(tipo == "cp"){
                this.saldo = saldo - 20.0f;
                System.out.println("Mensalidade de R$20,00 paga com sucesso.");
            }
        }
    }
    public void sacar(float saque){
        if(this.getStatus()){
            if(this.getSaldo() >= saque){ //se o valor do saldo for maior ou igual ao valor do saque
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque no valor de R$" + saque + " efetuado com sucesso!");
            }else{
            System.out.println("Saldo insuficiente para saque!");
            }   
        }else{
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
        
    }
    public void gerarExtrato(){
        System.out.println("-----------------------------------------");
        System.out.println("EXTRATO DA CONTA");
        System.out.println("Titular da Conta: " + this.dono);
        System.out.println("Numero da Conta: " + this.numConta);
        System.out.println("Saldo Atual: " + this.saldo);
        System.out.println("Status da Conta: " + this.status);
    }
   public int getNumConta(){
       return this.numConta;
   } 
   public void setNumConta(int num){
       this.numConta = num;
   }
   public String getTipo(){
       return this.tipo;
   }
   public void setTipo(String t){
       this.tipo = t;
   }
   public String getDono(){
       return this.dono;
   }
   public void setDono(String d){
       this.dono = d;
   }
   public float getSaldo(){
       return this.saldo;
   }
   public void setSaldo(float s){
       this.saldo = s;
   }
   public boolean getStatus(){
       return this.status;
   }
   public void setStatus(boolean status){
       this.status = status;
   }
   public ContaBanco(){ //método construtor
       this.setSaldo(0);
       this.setStatus(false);
           
    }
}
