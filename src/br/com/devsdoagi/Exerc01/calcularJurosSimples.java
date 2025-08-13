package br.com.devsdoagi.Exerc01;

public class calcularJurosSimples {

    public static double calcular( double capitalInicial, double taxaJurosAnual, int meses){

        double capitalFinal;

        double juros = capitalInicial * taxaJurosAnual * meses;


        capitalFinal = capitalInicial + juros;


        return capitalFinal;
    }

    public static void main(String[] args) {

        double capitalInicio = 1000.0;
        double taxa = 5.0 / 100;
        int meses = 36;

        double monteFinal = calcular(capitalInicio, taxa, meses);

        System.out.printf("O montante final é de: R$ %.2f%n", monteFinal);
    }
}
