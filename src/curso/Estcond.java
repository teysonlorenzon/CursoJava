package curso;

import java.util.Scanner;

public class Estcond {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int number1, number2, number3, arm = 0;

		number1 = ler.nextInt();
		number2 = ler.nextInt();
		number3 = ler.nextInt();

		if (number1 > number2) {
			arm = number1;
		} else if (number2 > number1) {
			arm = number2;
		}
		if (arm > number3) {
			System.out.println("Higher = " + arm);
		} else {
			System.out.println("Higher = " + number3);
		}
		ler.close();
	}

}
