package br.com.devsdoagi.PooExercicio2;

public class Main {

    public static void main(String[] args) {
        contaBancaria banco = new contaBancaria();

        banco.setNomeTitular("Ryan Victor");
        banco.setNumeroConta("107289-9");
        banco.depositarSaldo(1000);
        banco.sacarSaldo(100);
        banco.exibirExtratos();

    }

}
