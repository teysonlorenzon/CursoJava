package curso;

import java.util.Locale;
import java.util.Scanner;

public class Entradadedados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		String name, name2;
		int many, number;
		Double price, fluentnumber;

		System.out.print("Enter your full name:");
		name = sc.nextLine();
		System.out.println("How many badrooms are there in your house?");
		many = sc.nextInt();
		System.out.print("Enter product price:");
		price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		name2 = sc.next();
		number = sc.nextInt();
		fluentnumber = sc.nextDouble();

		System.out.println(name);
		System.out.println(many);
		System.out.printf("%.2f", price);
		System.out.println(name2);
		System.out.println(number);
		System.out.println(fluentnumber);

		sc.close();
	}

}
