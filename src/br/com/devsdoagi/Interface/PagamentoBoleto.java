package br.com.devsdoagi.Interface;

public class PagamentoBoleto implements IPagamento{


    public void processarPagamento(double valor){

        System.out.println("Pagamento de R$"+valor+" realizado via boleto bancário.");
    }
}
