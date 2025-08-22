package br.com.devsdoagi.Hackathon;

public class ContaCorrente extends Conta{
    public ContaCorrente(String numeroDeConta, double saldo, String titular){
        super(numeroDeConta,saldo,titular);
    }

    @Override
    public void aplicarJuros() {

        double saldo = getSaldo();
        System.out.println("Não disponibilizamos juros em conta corrente! \n Seu saldo atual é de R$"+ saldo);
    }
}
