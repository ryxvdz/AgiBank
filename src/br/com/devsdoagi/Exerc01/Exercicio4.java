package br.com.devsdoagi.Exerc01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercicio4 {

    public static void main(String[] args) {

        int[] vendasDiarias = {150, 30, 22, 45, 12, 8, 28, 35, 41, 50};

        diaMaisVendido(vendasDiarias);

    }

    public static int diaMaisVendido(int[] vendas) {

        if (vendas == null || vendas.length == 0) {
            System.out.println("Array Vazia!");
            return -1;
        }

        int maiorVenda = vendas[0];
        int indiceMaiorVendas = 0;

        for (int i = 1; i < vendas.length; i++) {


            if (vendas[i] > maiorVenda) {

                maiorVenda = vendas[i];
                indiceMaiorVendas = i;

            }
        }
        System.out.println("o Maior dia vendido foi: " + indiceMaiorVendas);
        return indiceMaiorVendas;
    }
}
