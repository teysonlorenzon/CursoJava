package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product() {
	}

	public Product(String name, double price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;

	}

	public double totalValueInStock() {

		return price * quantity;

	}

	public void addProducts(int quant) {

		this.quantity += quant;
	}

	public void removeProducts(int quant) {
		this.quantity -= quant;
	}

	/* Get's e Seter's */

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() { 
		return quantity;
	}
	
	public String toString() {

		String result = String.format("%.2f", price);
		String result2 = String.format("%.2f", totalValueInStock());
		return name + ", $ " + result + ", " + quantity + " units, Total: $ " + result2;

	}

}
