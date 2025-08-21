package br.com.devsdoagi.Heranca.Exercicio1;

public class ContaBancaria {

    protected String titular;
    protected String numeroDaConta;
    protected Double saldo;

    public ContaBancaria(String titular, String numeroDaConta, Double saldo){

        this.titular= titular;
        this.numeroDaConta= numeroDaConta;
        this.saldo= saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {

        this.saldo = saldo;
    }

}
