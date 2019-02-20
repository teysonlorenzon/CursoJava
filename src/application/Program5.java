package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Notas nt = new Notas();
		
		nt.nome =sc.nextLine();
		nt.notaA = sc.nextDouble();
		nt.notaB = sc.nextDouble();
		nt.notaC = sc.nextDouble();
		
		System.out.println(nt);

	}

}
