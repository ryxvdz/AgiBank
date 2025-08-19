package br.com.devsdoagi.Heranca;

public class Veiculo {
    String marca;
    String modelo;
    int ano;

    public void exibirDados() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}
