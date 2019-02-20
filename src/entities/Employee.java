package entities;

public class Employee {

	public String name;
	public double grosssalary;
	public double tax;
	double rest;
	boolean quality = true;

	public double netSalary() {
		rest = grosssalary - tax;
		quality = false;
		return rest;

	}

	public void increaseSalary(double percent) {
		double result;
		result = this.grosssalary *= (percent / 100);
		rest += result;
	}

	public String toString() {
		if (quality == true) {
			return name + ", $ " + String.format("%.2f", netSalary());
		} else {
			return name + ", $ " + String.format("%.2f", rest);
		}

	}
}
