package br.com.devsdoagi.Excecoes.Exerc5;

public class Compara {
    public static void main(String[] args) {
        try {
            String[][] portfolios = {
                    {"0.05", "0.08", "A"},
                    {"0.07", "0.06", "0.09"},
                    {"0.02", "0.03", "0.04"}
            };

            for (int i = 0; i < portfolios.length; i++) {
                double soma = 0;
                for (int j = 0; j < portfolios[i].length; j++) {
                    double valor = Double.parseDouble(portfolios[i][j]);
                    soma += valor;
                }
                double media = soma / portfolios[i].length;
                System.out.println("Média do portfólio " + (i + 1) + ": " + media);
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor inválido encontrado em um portfólio!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Portfólio incompleto!");
        }
    }

}
