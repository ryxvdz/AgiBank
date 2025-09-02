package br.com.devsdoagi.Stream.Exercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaioresQue10 {

    public static void main(String[] args) {

        List<Integer> numeros= Arrays.asList(11,18,20,8,9,1);

        List<Integer>maiorQue10= numeros.stream()
                .filter(n->n>10)
                .collect(Collectors.toList());


        System.out.println(maiorQue10);

    }
}
