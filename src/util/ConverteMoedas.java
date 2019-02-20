package util;

public class ConverteMoedas {

	public static double dinheiro(double valor , double quant) {
		
		double custo = valor * quant;
		double taxa = custo * 0.06;
		return custo + taxa;
		
	}
	
}
