package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConverteMoedas;

public class Dolar_reais {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do dolar? : $ ");
		double dolar = sc.nextDouble();
		System.out.print("Quantos dolares você quer comprar? : $ ");
		double reais = sc.nextDouble();

		
		System.out.printf("Valor a pagar: R$ %.2f",ConverteMoedas.dinheiro(dolar, reais));
		
		sc.close();
	}

}
