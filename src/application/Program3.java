package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangle rt = new Retangle();
		
		System.out.println("Enter rectangle width and height:");
		rt.width = sc.nextDouble();
		rt.height = sc.nextDouble();
		
		System.out.println(rt);
		
		sc.close();
	}

}
