package br.com.devsdoagi.Exerc01;

import java.util.Scanner;

public class Matriz {

    public static void preencherMatriz(double [] [] matriz){
        Scanner sc = new Scanner(System.in);
// l = Linha // c = Coluna
        for (int l= 0; l< matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.println("Digite o Valor: ");
                matriz [l][c] = sc.nextDouble();
            }
        }
    }


    public static double calcularSomaTotal(double [][] matriz) {

        double soma = 0;
        for (int l=0; l< matriz.length; l++){
            for (int c= 0; c < matriz[l].length; c++){
                soma += matriz[l][c];
            }

        }
        return soma;
    }

    public static void main(String[] args) {

        double[][] matriz = new double[2][2];
        double total;

        preencherMatriz(matriz);
        total = calcularSomaTotal(matriz);

        System.out.println("A soma é: " + total);


    }
}
