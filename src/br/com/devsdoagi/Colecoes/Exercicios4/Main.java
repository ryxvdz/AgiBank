package br.com.devsdoagi.Colecoes.Exercicios4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void adicionarParcela(Map<String, List<Double>> emprestimos, String cpf, double valorParcela){

        emprestimos.putIfAbsent(cpf, new ArrayList<>());
        emprestimos.get(cpf).add(valorParcela);
    }

    public static double totalDevedor(Map<String, List<Double>> emprestimos, String cpf) {
        List<Double> parcelas = emprestimos.getOrDefault(cpf, List.of());
        double total = 0.0;

        for (Double parcela : parcelas) {
            total += parcela;
        }
        return total;
    }

    public static void exibirRelatorioDevedor(Map<String, List<Double>> emprestimos) {
        emprestimos.forEach((cpf, parcelas) ->
                System.out.println("CPF " + cpf + " - Total Devedor: R$ " + totalDevedor(emprestimos, cpf))
        );
    }

    public static void main(String[] args) {
        Map<String, List<Double>> emprestimos = new HashMap<>();
        adicionarParcela(emprestimos, "11111111111", 500);
        adicionarParcela(emprestimos, "11111111111", 300);
        adicionarParcela(emprestimos, "22222222222", 1000);
        exibirRelatorioDevedor(emprestimos);
    }


}
