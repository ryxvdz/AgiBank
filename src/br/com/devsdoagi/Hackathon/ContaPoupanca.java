package br.com.devsdoagi.Hackathon;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String numeroDeConta, double saldo, String titular){
        super(numeroDeConta,saldo,titular);
    }

    @Override
    public void aplicarJuros() {

        double saldo = getSaldo();
        double newSaldo= saldo* 1.01;
        System.out.println("Seu saldo é de R$" + newSaldo);
    }

}
