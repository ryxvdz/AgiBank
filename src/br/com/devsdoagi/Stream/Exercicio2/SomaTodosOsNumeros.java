package br.com.devsdoagi.Stream.Exercicio2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SomaTodosOsNumeros {
    public static void main(String[] args) {

        List<Integer>numeros= Arrays.asList(1,2,3,4);

        int soma = numeros.stream()
                .reduce(0,Integer::sum);

        System.out.println(soma);
    }
}
