package br.com.devsdoagi.HackathonCollections;

import br.com.devsdoagi.HackathonCollections.Cliente;
import br.com.devsdoagi.HackathonCollections.Conta;

import java.util.*;

public class Main {
    private static Set<Cliente> clientes = new HashSet<>();
    private static Map<Integer, Conta> contas = new HashMap<>();
    private static int numeroConta = 1001;

    private static void cadastrarCliente(Set<Cliente> clienteSet, Scanner sc) {
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();

        if (clienteSet.add(new Cliente(nome, cpf))) {
            System.out.println("Cliente cadastrado com sucesso!");
        } else {
            System.out.println("Cliente já existe");
        }
    }

    public static void cadastrarConta(Map<Integer, Conta> contas, Set<Cliente> clientes, Scanner sc) {
        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null) {
            System.out.println("Cliente não cadastrado!");
            return;
        }

        Conta conta = new Conta(numeroConta, clienteEncontrado);
        contas.put(numeroConta, conta);

        System.out.println("Conta criada com sucesso! Número: " + numeroConta);
        numeroConta++;
    }

    private static void listarClientes(Set<Cliente> clientesList) {
        for (Cliente cliente : clientesList) {
            System.out.println("Cliente - " + cliente);
        }
    }

    private static void consultarSaldo(Scanner sc) {
        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        if (contas.containsKey(numero)) {
            Conta conta = contas.get(numero);
            System.out.println("Saldo da conta " + numero + ": " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== MENU BANCO DIGITAL ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Depósito");
            System.out.println("4 - Saque");
            System.out.println("5 - Transferência");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Extrato");
            System.out.println("8 - Listar Clientes");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");

            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> cadastrarCliente(clientes, sc);
                case 2 -> cadastrarConta(contas, clientes, sc);
                case 6 -> consultarSaldo(sc);
                case 8 -> listarClientes(clientes);
                case 9 -> rodando = false;
                default -> System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}