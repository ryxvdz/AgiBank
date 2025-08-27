package br.com.devsdoagi.Colecoes.Exercicios3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void adicionarCliente(Map<String,Double> contas, String numeroDaConta, Double saldoDaConta){

        if (contas.containsKey(numeroDaConta)){
            System.out.println("Conta já existe");
        }
        else{
            contas.put(numeroDaConta,saldoDaConta);
        }

    }

    public static void depositar(Map<String, Double> contas, String numeroConta, double valor){
        contas.put(numeroConta, contas.getOrDefault(numeroConta, 0.0) + valor);
    }


    public static void exibirSaldos(Map<String, Double> contas) {
        contas.forEach((conta, saldo) -> System.out.println("Conta " + conta + " - Saldo: R$ " + saldo));
    }

    public static void main(String[] args) {
        Map<String, Double> contas = new HashMap<>();
        adicionarCliente(contas, "123", 1000.0);
        adicionarCliente(contas, "123", 1000.0);
        adicionarCliente(contas,"321", 2000.0);
        adicionarCliente(contas, "1234-3", -1.0);

        depositar(contas,"123", 100.0);

        exibirSaldos(contas);

    }
}
