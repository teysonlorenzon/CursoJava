package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee ep = new Employee();

		System.out.print("Name: ");
		ep.name = sc.nextLine();

		System.out.print("Gross salary: ");
		ep.grosssalary = sc.nextDouble();

		System.out.print("Tax: ");
		ep.tax = sc.nextDouble();

		System.out.println("Employee: " + ep);

		double percent;

		System.out.print("Witch percentage to increase salary? ");
		percent = sc.nextDouble();
		ep.increaseSalary(percent);

		System.out.println("Updated data: " + ep);
		
		sc.close();

	}

}
