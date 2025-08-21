package br.com.devsdoagi.Interface;

public class PagamentoCartao implements IPagamento{


    public void processarPagamento(double valor){

        System.out.println( "Pagamento de R$ "+valor+" realizado via cartão de crédito.");
    }

}
