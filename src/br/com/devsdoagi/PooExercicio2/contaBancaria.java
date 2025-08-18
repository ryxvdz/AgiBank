package br.com.devsdoagi.PooExercicio2;

public class contaBancaria {

    private String  nomeTitular;
    private String numeroConta;
    private double saldo;


    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositarSaldo(double valor) {

        if (valor >0 ){
            this.saldo +=valor;
        }
        else {
            System.out.println("Não aceitamos valores negativos!!");
        }
    }

    public double sacarSaldo(double valor) {
        if(valor>this.saldo){
            System.out.println("Valor desejado de saque menor que o saldo da conta!");
        }
        else {
            this.saldo -=valor;

        }
        return this.saldo;
    }

    public void exibirExtratos(){
        System.out.println("Titular: "+ getNomeTitular());
        System.out.println("Número da conta: "+ getNumeroConta());
        System.out.println("Saldo: "+ this.saldo);
    }

}
