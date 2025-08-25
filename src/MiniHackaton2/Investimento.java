package MiniHackaton2;

abstract class Investimento {

    protected double valorInicial;

    public Investimento(double valorInicial){
        this.valorInicial=valorInicial;
    }

    public abstract void calcularRendimento();
}
