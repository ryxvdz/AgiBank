package br.com.devsdoagi.Excecoes.Exerc1;

import java.util.Scanner;

public class SaldoConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] saldos = { 1500.50, 2350.75, 800.00, 10500.25, 1000.0, 420.10, 9500.80, 120.99, 5430.45, 765.30 };
        System.out.println("Digite o indice que deseja buscar: ");
        int buscador= sc.nextInt();
        try {
            System.out.println(saldos[buscador]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice errado: "+e.getMessage());
        }
    }
}
