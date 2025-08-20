package br.com.devsdoagi.SistemaBancario;

public class Conta {

    private String numeroConta;
    private double saldo;
    private String clienteTitular;



    public Conta(String numeroConta, double saldo, String clienteTitular){
        this.numeroConta=numeroConta;
        this.saldo=0.0;
        this.clienteTitular = clienteTitular;
    }

}
