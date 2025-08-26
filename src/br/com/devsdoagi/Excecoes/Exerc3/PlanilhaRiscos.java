package br.com.devsdoagi.Excecoes.Exerc3;

public class PlanilhaRiscos {
    public static void main(String[] args) {
        double[][] matriz = {
                {1, 0.2, 0.3, 0.4, 0.5},
                {0.6, 0.7, 0.8, 0.9, 0.1},
        };

        try{

            for (int linha = 0; linha < 5; linha++) {
                for (int coluna = 0; coluna < 5; coluna++) {
                    if (matriz[linha][coluna]>=1){
                        throw new NumeroMaiorException(String.format("Número acima de 1 na linha %d e coluna %d (valor=%.2f)", linha, coluna, matriz[linha][coluna]));
                    }
                }

            }
        } catch (NumeroMaiorException e) {
            System.out.println("Numero maior burro");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Matriz é 5x5 burro");
        }

    }
}