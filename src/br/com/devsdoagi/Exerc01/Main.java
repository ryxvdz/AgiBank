package br.com.devsdoagi.Exerc01;

public class Main {

    public static void main(String[] args) {
        double[] resultado = calcularSaldoAnual(20, 40, 100, 10);

        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("Saldo ao final do ano %d: R$ %.2f\n", (i + 1), resultado[i]);
        }
    }


    public static double[] calcularSaldoAnual(int idadeAtual, int idadeAposentadoria,
                                              double contribuicaoMensal, double taxaDeJurosAnual) {

        int anosContribuicao = idadeAposentadoria - idadeAtual;
        double[] vet = new double[anosContribuicao];


        double taxaAnualDecimal = taxaDeJurosAnual / 100.0;

        double r = taxaAnualDecimal / 12.0;


        for (int i = 0; i < vet.length; i++) {
            int n = (i + 1) * 12;


            double saldoFinalDoAno = contribuicaoMensal * ((Math.pow(1 + r, n) - 1) / r);

            vet[i] = saldoFinalDoAno;
        }



        return vet;
    }
}