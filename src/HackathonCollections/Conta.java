package HackathonCollections;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private int numero;
    private Cliente nome;
    private double saldo;
    private List<Transacao> extrato;

    public Conta(int numero, Cliente nome) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
    }

    public int getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    // Dicas para os métodos a implementar:
    // - depositar(double valor): adicionar ao saldo, registrar transação
    // - sacar(double valor): verificar saldo, subtrair valor, registrar transação
    // - transferir(double valor, Conta destino): verificar saldo, atualizar saldos, registrar transações em ambas contas
    // - mostrarExtrato(): percorrer lista de transações e imprimir


}
