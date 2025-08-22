package br.com.devsdoagi.Hackathon;

abstract class Conta {

    private String numeroDeConta;
    private double saldo;
    private String titular;



    public Conta(String numeroDeConta, double saldo, String titular){
        this.numeroDeConta= numeroDeConta;
        this.saldo= 0.0;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroDeConta() {
        return numeroDeConta;
    }

    public void setNumeroDeConta(String numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -=valor;
    }


    public abstract void aplicarJuros();

}
