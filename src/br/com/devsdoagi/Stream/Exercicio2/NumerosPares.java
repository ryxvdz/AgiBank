package br.com.devsdoagi.Stream.Exercicio2;
import java.util.*;
import java.util.stream.*;


public class NumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(pares); // [2, 4, 6]
    }

}
