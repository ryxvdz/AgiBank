package br.com.devsdoagi.Poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerMenu = new Scanner(System.in);
        Produto product = new Produto();

        int opcao;
        do {
            System.out.println("\n### MENU DE OPÇÕES ###");
            System.out.println("1-  Inserir Produto: ");
            System.out.println("2 - Adicionar mais produtos ao estoque");
            System.out.println("3 - Remover produtos do estoque");
            System.out.println("4 - Exibir dados do produto");
            System.out.println("0 - Sair do programa");
            System.out.print("Escolha uma opção: ");

            opcao = scannerMenu.nextInt();

            switch (opcao) {

                case 1:
                    product.setandoValores();
                    break;

                case 2:
                    product.adicionarEstoque();
                    break;

                case 3:
                    product.removerEstoque();
                    break;

                case 4:
                    product.showTheProduct();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    break;
            }


        } while (opcao != 0);
    }
}
