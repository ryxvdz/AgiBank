package MiniHackaton2;

//Autor: Ryan Victor da Silva Dias

public class Main {
    public static void main(String[] args) {

        Investimento[] listaInv = new Investimento[4];
        listaInv[0] = new RendaFixa(1000.0);
        listaInv[1] = new RendaVariavel(2000.0);
        listaInv[2] = new RendaFixa(100.0);
        listaInv[3] = new RendaVariavel(100.0);

        for (Investimento inv : listaInv){
           inv.calcularRendimento();
        }
    }
}
