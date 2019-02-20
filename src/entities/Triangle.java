package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	public double area() {
		double p, areatot;
		p = (a + b + c) / 2.0;
		areatot = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return areatot;
	}
}
