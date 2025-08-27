package br.com.devsdoagi.Colecoes.Exercicios2;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void adicionarProdutos(Set<String> produto, String nomeProduto){

        if (produto.add(nomeProduto)){
            System.out.println("Produto "+nomeProduto+ " adicionado com sucesso: ");
        }
        else{
            System.out.println("Produto"+nomeProduto+" ja existente: ");
        }
    }

    public static void exibirContas(Set<String> listaDeProdutos){
        for(String produto: listaDeProdutos){
            System.out.println("- " + produto);
        }
    }


    public static void main(String[] args) {
        Set<String> meusProdutos = new HashSet<>();
        adicionarProdutos(meusProdutos,"Nargas");
        adicionarProdutos(meusProdutos,"Ola");

        exibirContas(meusProdutos);


    }
}
