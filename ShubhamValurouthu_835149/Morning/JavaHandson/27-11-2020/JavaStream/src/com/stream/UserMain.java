package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UserMain {

	public static void main(String[] args) {
		
		List<Laptop> allProducts = new ArrayList<Laptop>();
		allProducts.add(new Laptop(4.1, "HP", 50000.0));
		allProducts.add(new Laptop(4.0, "DELL", 45000.0));
		allProducts.add(new Laptop(4.5, "Lenovo", 65000.0));
		allProducts.add(new Laptop(4.6, "HP", 75000.0));
		allProducts.add(new Laptop(4.9, "Lenovo", 55000.0));
		allProducts.add(new Laptop(3.0, "DELL", 25000.0));

		List<Laptop> product = new ArrayList<Laptop>();

		for (int i = 0; i < allProducts.size(); i++) {

			if (allProducts.get(i).getName() == "HP") {
				product.add(allProducts.get(i));
			}

		}

		Collections.sort(product, (P1, P2) -> P2.getRating().compareTo(P1.getRating()));

		// using traditional For loop
		System.out.println("------using traditional For loop------");
		for (int i = 0; i < product.size(); i++)
			System.out.println(product.get(i));

		// Using new For Loop
		System.out.println("------Using new For Loop------");
		for (Laptop L : product)
			System.out.println(L);

		// Using Stream APi
		System.out.println("------Using Stream APi------");
		List<Laptop> allProducts2 = new ArrayList<Laptop>();
		allProducts2.add(new Laptop(4.1, "HP", 50000.0));
		allProducts2.add(new Laptop(4.0, "DELL", 45000.0));
		allProducts2.add(new Laptop(4.5, "Lenovo", 65000.0));
		allProducts2.add(new Laptop(4.6, "HP", 75000.0));
		allProducts2.add(new Laptop(4.9, "Lenovo", 55000.0));
		allProducts2.add(new Laptop(3.0, "DELL", 25000.0));
		List<Laptop> product2 = allProducts2.stream()
				.filter(item -> item.getName().equals("HP") || item.getName().equals("Lenovo"))
				.filter(item -> item.getPrice() > 60000).sorted((L1, L2) -> L2.getRating().compareTo(L1.getRating()))
				.collect(Collectors.toList());
		for (Laptop Laptop : product2) {
			System.out.println(Laptop);
		}

		// Using Map-Intermediate Stream operation
		System.out.println("------Using Map-Intermediate Stream operation------");
		allProducts2.stream().map(item -> item.getName()).distinct().collect(Collectors.toList())
				.forEach(item -> System.out.println(item));

	

	}

}
