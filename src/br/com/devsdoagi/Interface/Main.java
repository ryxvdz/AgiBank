package br.com.devsdoagi.Interface;

public class Main {

    public static void main(String[] args) {

        IPagamento pagamento1 = new PagamentoBoleto();
        IPagamento pagamento2 = new PagamentoCartao();


        pagamento1.processarPagamento(100);
        pagamento2.processarPagamento(200);

    }
}
