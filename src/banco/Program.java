package banco;

import java.util.Locale;
import java.util.Scanner;

import utilsbanco.Conta;

public class Program {

	private static Scanner sc;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		int numero;
		String nome;
		double quantidade;
		char resp;
		Conta co;

		System.out.print("Digite o numero da conta: ");
		numero = Integer.parseInt(sc.nextLine());
		System.out.print("Digite o nome da conta: ");
		nome = sc.nextLine();
		System.out.print("Quer fazer um deposito inicial? (y/n) : ");
		resp = sc.nextLine().charAt(0);

		while (resp != 'y' && resp != 'Y' && resp != 'n' && resp != 'N') {
			System.out.println("Por favor digite (y/n): ");
			resp = sc.nextLine().charAt(0);
		}

		if (resp == 'y' || resp == 'Y') {
			System.out.printf("Digite a quantidade para deposito inicial: ");
			quantidade = sc.nextDouble();

			co = new Conta(numero, nome, quantidade);
			System.out.println("\n" + co);

		} else {

			co = new Conta(numero, nome);
			System.out.println("\n" + co);

		}
		System.out.printf("%nDigite a quantidade para deposito:");
		quantidade = sc.nextDouble();
		co.deposito(quantidade);
		System.out.println("Conta Atualizada:\n" + co);

		System.out.printf("%nDigite a quantidade para saque: ");
		quantidade = sc.nextDouble();
		co.saques(quantidade);
		System.out.println("Conta Atualizada:\n" + co);
		
		sc.close();
	}

}
