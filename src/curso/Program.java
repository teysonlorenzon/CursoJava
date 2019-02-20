package curso;

import java.util.Locale;
import java.util.Scanner;

import util.Employess;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean confere = false;

		System.out.print("how many employess will be registered? ");
		int n = sc.nextInt();
		System.out.println();

		Employess[] vect = new Employess[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.printf("Emplyoee #%d:%n", i + 1);

			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			vect[i] = new Employess(id, name, salary);
			System.out.println();
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();

		for (int i = 0; i < vect.length; i++) {

			if (id == vect[i].getId()) {
				System.out.print("Enter the porcentage: ");
				double percent = sc.nextDouble();
				vect[i].upSalary(percent);
				System.out.println();
				confere = true;
			}
		}

		if(confere == false) {
			System.out.println("This id does not exist!\n");
		}
		
		System.out.println("List of employees:");
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		sc.close();

	}

}
