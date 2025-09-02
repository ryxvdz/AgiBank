package br.com.devsdoagi.Stream.Exercicio2;

import java.util.Arrays;
import java.util.List;

public class MultiplicarTodos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);


        int multiplicarTodos = numeros.stream()
                .reduce(1,(a,b)->a*b);

        System.out.println(multiplicarTodos);
    }
}
