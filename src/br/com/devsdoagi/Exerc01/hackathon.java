package br.com.devsdoagi.Exerc01;

public class hackathon {

    public static void main(String[] args) {
        double[] resultado = calcularSaldoAnual(20,40, 100, 10);
        for (int i = 0; i <= resultado.length-1; i ++){
            System.out.printf("%.2f\n",resultado[i]);
        }
    }



    public static double[] calcularSaldoAnual(int idadeAtual,int idadeAposentadoria,
                                              double contribuicaoMensal, double taxaMensal){


       int anosContribuicao = idadeAposentadoria - idadeAtual;
       double [] vet = new double[anosContribuicao];
        double soma = 0;
       for (int i = 0; i <= vet.length - 1; i++){
            for (int j = 1; j <= 12; j++){
                soma += contribuicaoMensal;
                double taxa = soma * (taxaMensal / 100);
                soma += taxa;
            }
            vet[i] = soma;
       }
       return vet;

        //calculo = contribuicaoMensal * ((1 + taxaMensal)^contribuicaoMensal - 1) / taxaMensal;

        }
    }

