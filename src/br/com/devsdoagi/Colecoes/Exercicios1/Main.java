package br.com.devsdoagi.Colecoes.Exercicios1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void adicionarContas(Set<Integer> contas, int numeroConta){

        if (contas.add(numeroConta)){
            System.out.println("Conta: "+numeroConta+ " Adicionada com sucesso");
        }
        else {
            System.out.println("Conta já existente");
        }
    }

    public static boolean existeConta(Set<Integer> contas, int numeroConta){

        return contas.contains(numeroConta);
    }

    public static void exibirContas(Set<Integer> contas, int numeroConta){
        System.out.println("Contas cadastradas: "+ contas);
    }

    public static void main(String[] args) {
        Set<Integer> contas = new HashSet<>();
        adicionarContas(contas,123);
        adicionarContas(contas, 2121);
        adicionarContas(contas,123);
        System.out.println("Essa conta ja existe? "+existeConta(contas,2121));

    }
}
