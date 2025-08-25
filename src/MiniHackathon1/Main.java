package MiniHackathon1;

//Autor: Ryan Victor da Silva Dias
public class Main {

    public static void main(String[] args) {

        Analista analista1= new Analista("Ryan", 2000.0);
       Gerente gerente1 = new Gerente("Victor", 4000);

        System.out.println("Nome do Gerente: "+gerente1.getNome()+"\n"+"Salario: R$"+gerente1.getSalario()+"\n"+"Bonus: R$"+gerente1.bonus+"\n");

        System.out.println("Nome do Analista: "+analista1.getNome()+"\n"+"Salario: R$"+analista1.getSalario()+"\n"+"Bonus: R$"+analista1.bonus);
    }
}
