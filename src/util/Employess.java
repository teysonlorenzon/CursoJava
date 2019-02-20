package util;

public class Employess {

	private int id;
	private String name;
	private double salary;

	public Employess() {
		
	}
	
	public Employess(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void upSalary(double percent) {
		double convert = percent/100;
		double newsalary = this.salary * convert;
		this.salary += newsalary;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	
	

}
