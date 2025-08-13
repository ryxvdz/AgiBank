package br.com.devsdoagi.Exerc01;

import java.util.Scanner;

public class Matriz {

    void preencherMatriz(double [] [] matriz){
        Scanner sc = new Scanner(System.in);
// l = Linha // c = Coluna
        for (int l= 0; l< matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.println("Digite o Valor: ");
                matriz [l][c] = sc.nextDouble();
            }
        }
    }


    void calcularSomaTotal(double [][] matriz) {

        for (int l=0; l< matriz.length; l++){
            for (int c= 0; c < matriz[l].length; c++){

            }
        }
    }

    public static void main(String[] args) {


    }
}
