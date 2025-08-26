package br.com.devsdoagi.Excecoes.Exerc4;

public class SimuParc {

    public static void main(String[] args) {
        try {
            double valorEmprestimo = 10000;
            double taxaJuros = -0.02; // taxa negativa (vai gerar erro)
            int meses = 12;

            if (taxaJuros < 0) {
                throw new IllegalArgumentException("A taxa de juros não pode ser negativa!");
            }
            if (valorEmprestimo == 0) {
                throw new ArithmeticException("O valor do empréstimo não pode ser zero!");
            }

            double parcela = (valorEmprestimo * taxaJuros) / (1 - Math.pow(1 + taxaJuros, -meses));
            System.out.println("Valor da parcela mensal: " + parcela);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
