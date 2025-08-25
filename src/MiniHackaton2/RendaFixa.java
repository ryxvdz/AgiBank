package MiniHackaton2;

public class RendaFixa extends Investimento {

    public RendaFixa(double valorInicial){
        super(valorInicial);
    }

    public void calcularRendimento() {

        double valorAtual;
        valorAtual=valorInicial * 1.05;

        System.out.printf("Valor inicial: %.2f | Valor apos rendimento fixa: %.2f\n", this.valorInicial, valorAtual);
    }
}
