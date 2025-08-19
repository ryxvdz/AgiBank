package br.com.devsdoagi.Heranca.Exercicio1;

public class ContaCorrente extends ContaBancaria{
    private Double limiteChequeEspecial;


    public ContaCorrente(String titular, String numeroDaConta, Double saldo, Double limiteChequeEspecial){
        super(titular, numeroDaConta,saldo);
        this.limiteChequeEspecial= limiteChequeEspecial;
    }
    public void sacarComChequeEspecial(Double quantidaDeSaque){

        double saldoDisponivel = this.saldo+ this.limiteChequeEspecial;
        if(quantidaDeSaque>saldoDisponivel){
            System.out.println("Saldo indisponivel");
        }
       else{
           this.saldo-=quantidaDeSaque;
            System.out.println("Saque de "+quantidaDeSaque+ "realizado com Sucesso");
            System.out.printf("Novo saldo: R$%.2f\n", this.saldo);
        }
    }

}
