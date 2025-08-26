package Hackathon;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Ryan Victor", "777777777");
        Conta cc = new ContaCorrente("123456-8",1000.0,"Ryan");
        Conta cp = new ContaPoupanca("123456-8",1000.0,"Ryan");

        cc.depositar(100);
        cp.depositar(200);

        cc.sacar(50);
        cp.sacar(100);

        cc.aplicarJuros();
        cp.aplicarJuros();
    }
}
// 1 - 10
// 2 - 10
// 3 - 10
// 4 - 20
// 5 - 10
// 6 - 10
// 7 - 10
// 8 - 10
// Final - 100