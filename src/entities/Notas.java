package entities;

public class Notas {

	public String nome;
	public double notaA;
	public double notaB;
	public double notaC;
	double faltam;
	boolean validar = true;

	public double condAluno() {
		double somaNotas;
		double semestreP, semestreS, semestreT;
		double somaSemestres;

		somaNotas = notaA + notaB + notaC;
		semestreP = 30 * 0.6;
		semestreS = 35 * 0.6;
		semestreT = 35 * 0.6;
		somaSemestres = semestreP + semestreS + semestreT;

		if (somaNotas < somaSemestres) {
			
			faltam = somaSemestres - somaNotas;
			validar = false;	

		} 
		
		return somaNotas;

	}

	public String toString() {
		
		if(validar == true) {
			return "FINAL GRADE = " + String.format("%.2f",condAluno()) + "\nPASS";
		}else {
			return "FINAL GRADE = " + String.format("%.2f",condAluno()) + "\nFAILED\n" + "MISSING " + faltam +" POINTS";
		}
		
	}

}
