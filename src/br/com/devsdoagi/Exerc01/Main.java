package br.com.devsdoagi.Exerc01;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        double[] precos = {18.50, 16.00, 19.00, 18.00, 10.00, 20.00, 28.00, 22.00, 23.00, 54.00};


        int[] trincaAlta = primeiraTrincaAlta(precos);


        System.out.println("Primeira trinca de alta: "+ Arrays.toString(trincaAlta));
    }

    public static int[] primeiraTrincaAlta(double[] precos) {

        for (int i = 0; i <= precos.length - 3; i++) {
            if (precos[i] < precos[i+1] && precos[i+1] < precos[i+2]) {

                return new int[]{i, i + 1, i + 2};
            }
        }

        return null;
    }


   public static int [] primeiraTendenciaAlta(double[] precos){

    return null;
   }
}