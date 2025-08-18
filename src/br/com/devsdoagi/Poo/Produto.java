package br.com.devsdoagi.Poo;

import java.util.Scanner;

public class Produto {

    private Scanner sc = new Scanner(System.in);
    String nome;
    double preco ;
    int quantidade;



    public void setandoValores(){
        System.out.println("Entre com o nome: ");
        this.nome = sc.next();

        System.out.println("Entre com o preço: ");
        this.preco = sc.nextDouble();

        System.out.println("Entre com a quantidade inicial em estoque: ");
        this.quantidade= sc.nextInt();
    }


    public void adicionarEstoque(){
        System.out.println("Digite quantos produtos você quer adicionar: ");
        int controleQuantidade = sc.nextInt();
        quantidade = quantidade + controleQuantidade;
        System.out.println("Adicionando: " + controleQuantidade+ " produtos no estoque!");
        System.out.println("Voce tem "+ this.quantidade+" novos produtos adicionado");
    }

    public void removerEstoque(){
        System.out.println("Digite quantos produtos você quer remover: ");
        int controleQuantidade = sc.nextInt();
        quantidade = quantidade-controleQuantidade;
        System.out.println(controleQuantidade+ " produtos foram removidos do estoque!");

    }

    public void showTheProduct(){
        System.out.println("O nome do seu produto é : " + this.nome);
        System.out.println("O preço dele é : "+ this.preco);
        System.out.println("A quantidade dele é "+this.quantidade);
    }


}
