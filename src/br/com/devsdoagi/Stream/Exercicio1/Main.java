package br.com.devsdoagi.Stream.Exercicio1;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Double> valores = List.of(6000.0, -200.0, 1500.0, 120000.0, 300.0, 800.0);

        // 1. Soma dos valores > 5000
        double somaAltas = valores.stream()
                .filter(v -> v > 5000)
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println("Soma > 5000: " + somaAltas);

        // 2. Maior depósito
        double maior = valores.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(0);
        System.out.println("Maior valor: " + maior);

        // 3. Saldos negativos
        List<Double> negativos = valores.stream()
                .filter(v -> v < 0)
                .toList();
        System.out.println("Negativos: " + negativos);

        // 4. Média dos saldos
        double media = valores.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
        System.out.println("Média: " + media);

        // 5. Ordenação decrescente
        List<Double> decrescente = valores.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Decrescente: " + decrescente);

        // 6. Contagem de valores > 1000
        long contAltas = valores.stream()
                .filter(v -> v > 1000)
                .count();
        System.out.println("Valores > 1000: " + contAltas);

        // 7. Existência de valor > 100000
        boolean possuiMilhao = valores.stream()
                .anyMatch(v -> v > 100000);
        System.out.println("Algum > 100000: " + possuiMilhao);

        // 8. Concatenação dos valores positivos
        String positivosConc = valores.stream()
                .filter(v -> v > 0)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Positivos concatenados: " + positivosConc);

        // 9. Soma dos positivos
        double somaPos = valores.stream()
                .filter(v -> v > 0)
                .reduce(0.0, Double::sum);
        System.out.println("Soma dos positivos: " + somaPos);

        // 10. Produto acumulado das taxas
        List<Double> taxas = List.of(1.02, 1.05, 0.98);
        double produto = taxas.stream()
                .reduce(1.0, (a, b) -> a * b);
        System.out.println("Produto taxas: " + produto);
    }
}
