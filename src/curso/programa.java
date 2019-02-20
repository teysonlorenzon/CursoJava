package curso;

import java.util.Locale;

public class programa {

	public static void main(String[] args) {

		String produce1 = "Computer";
		String produce2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:\n");
		System.out.printf("%s, which price is $ %.2f%n" ,produce1,price1);
		System.out.printf("%s, which price is $ %.2f%n",produce2,price2);
		System.out.printf("Record: %s years old, code %d and gender: %c%n%n",age,code,gender);
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
		
		

		
	}

}
