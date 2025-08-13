package br.com.devsdoagi.Exerc01;

public class converterMoeda {
    public static double converter(double usd , double real){

        return usd * real;
    }


    public static void main(String[] args) {

        double valorUsd= 40;
        double valorReal = 5.44;
        double conversao= converter(valorUsd, valorReal);


        System.out.printf("O valor convertido é de: %.2f%n", conversao);

    }


}
