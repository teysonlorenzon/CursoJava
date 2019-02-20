package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Quartos[] vect = new Quartos[10];
		System.out.println("");

		for (int i = 1; i <= n ; i++) {

			System.out.printf("Rent #%d:%n", i);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int room = sc.nextInt();

			vect[room] = new Quartos(name, email);

		}

		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {

			if (vect[i] != null) {
				System.out.println(i+ ": " + vect[i]);
			}
		}

		sc.close();

	}

}
