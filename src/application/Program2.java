package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number;

		System.out.println("Enter product data:");

		System.out.print("Name:");
		String name = sc.nextLine();

		System.out.print("Price:");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock:");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());

		System.out.println("Product date: " + product);

		System.out.print("Enter the number of products to be added in stock: ");
		number = sc.nextInt();
		product.addProducts(number);

		System.out.println("Updated date: " + product);

		System.out.print("Enter the number of products to be removed from stock: ");
		number = sc.nextInt();
		product.removeProducts(number);

		System.out.println("Updated date: " + product);

		sc.close();

	}

}
