package Javaprogram;

import java.util.ArrayList;
import java.util.List;

public class ProductCollectors {
	
	public static void main(String[] args) {
		// Create a list of products
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Product 1", 50.0, 10));
		products.add(new Product(2, "Product 2", 150.0, 5));
		products.add(new Product(3, "Product 3", 200.0, 8));
		products.add(new Product(4, "Product 4", 75.0, 12));
		
		// Filter products whose price is greater than 100 and print them using stream API
		System.out.println("Products with price greater than 100:");
		products.stream()
				.filter(product -> product.getPrice() > 100)
				.forEach(System.out::println);
	}
	
}

//make a product class with filds id, name, price, quantity and create a list of products and filter the products whose price is greater than 100 and print them using stream api
 	
class  Product{	
		
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Product(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	//tostring 
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}