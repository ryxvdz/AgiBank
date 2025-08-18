package br.com.devsdoagi.Construtor;

public class ContaBancaria {
    private String  nomeTitular;
    private String numeroConta;
    private double saldo;


    public ContaBancaria(String nomeTitular, String numeroConta){
        this.nomeTitular=nomeTitular;
        this.numeroConta=numeroConta;
        this.saldo=0.0;
    }
}
