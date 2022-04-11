package Aplicacao;

import entidades.ContaCorrente;
import entidades.ContaPoupanca;


import java.util.Scanner;

import entidades.Cliente;
import entidades.Conta;

public class Programa {
	public static void main(String[] args) {
		Scanner menu = new Scanner (System.in);

        while (true) {            

        System.out.print("##---- BANCO DEV DIGITAL ----##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Op��o 1 - Novo Cadastro     |\n");
        System.out.print("| Op��o 2 - Saque             |\n");
        System.out.print("| Op��o 3 - Deposito          |\n");
        System.out.print("| Op��o 4 - Transfer�ncia     |\n");
        System.out.print("| Op��o 5 - Imprimir extrato  |\n");
        System.out.print("| Op��o 6 - Sair              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma op��o: ");

        int opcao = menu.nextInt();

        if (opcao == 6) {
            System.out.print("\nBanco Dev Digital agradece a prefer�ncia. At� logo!");
            break; 
        }

        switch (opcao) {
        case 1:
        	cadastrar();
            break;

        case 2:
            sacar();
            break;

        case 3:
            depositar();
            break;
            
        case 4:
            transferir();
            
        case 5:
            imprimir();
            break;

        default:
            System.out.print("\nOp��o Inv�lida!");
            break;
    }
        
}
}
		
		
		
		
		//Cliente Felipe = new Cliente();
		//Felipe.setNome("Felipe Matos");
		
		//Conta cc = new ContaCorrente(Felipe);
		//cc.depositar(300);
		
		//Conta poupanca = new ContaPoupanca(Felipe);
		//cc.transferir(100, poupanca);
	
		//cc.imprimirExtrato();
		//poupanca.imprimirExtrato();
		
	
	public static void cadastrar(){
		Scanner leitor = new Scanner(System.in);
		Conta cc;
		
		System.out.println("Entre com as informa��es da conta:");
		System.out.print("Titular da conta: ");
		String nome = leitor.nextLine();
		Cliente cliente = new Cliente(nome);
		
		System.out.println("Deseja criar ");
		System.out.println("Deseja fazer um deposito inicial? (s/n)");
		char resposta = leitor.next().charAt(0);
		if (resposta == 's' || resposta == 'S') {
			System.out.print("Insira o valor do deposito inicial: R$");
			double depositoInicial = leitor.nextDouble();
			cc = new ContaCorrente(cliente);
			cc.depositar(depositoInicial);		
		} else {
			cc = new ContaCorrente(cliente);
		}
		
		cc.imprimirExtrato();
		//leitor.close();
    }
	
	public static void imprimir() {
		cc.imprimirExtrato();
	}
}
