package MiniHackaton2;

public class RendaVariavel extends Investimento{

    public RendaVariavel(double valorInicial){
        super(valorInicial);
    }

    public void calcularRendimento() {

        double valorAtual;
        valorAtual=valorInicial * 1.10;

        System.out.printf("Valor inicial: %.2f | Valor apos rendimento variavel: %.2f\n", this.valorInicial, valorAtual);
    }
}
