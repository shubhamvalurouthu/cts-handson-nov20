package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String... strings) {
		List<Product> list = new ArrayList<Product>();
		List<Product> list1 = new ArrayList<Product>();
		list.add(new Product(1, "Facewash", 100.0));
		list.add(new Product(3, "Shampoo", 300.0));
		list.add(new Product(2, "Conditioner", 200.0));

		list1.add(new Product(1, "Facewash", 100.0));
		list1.add(new Product(3, "Shampoo", 300.0));
		list1.add(new Product(2, "Conditioner", 200.0));

		// Using comparable
		System.out.println("Using Comparable");
		Collections.sort(list);
		System.out.println(list);

		// Using comparator
		System.out.println("Using Comparator -  Ascending");
		Comparator<Product> c = new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getId() - o2.getId();
			}
		};
		Collections.sort(list1, c);
		System.out.println(list1);

		// Using comparator
		System.out.println("Using Comparator -  Descending");
		Comparator<Product> c1 = new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o2.getId() - o1.getId();
			}
		};
		Collections.sort(list1, c1);
		System.out.println(list1);
		
		// Using comparator Using function interface and lambda expression sorting name
		System.out.println("Using Comparato - function interface and lambda expressionr -  Aescending -Names");
		Comparator<Product> c2 = (s1 , s2)-> s1.getName().compareTo(s2.getName());
		Collections.sort(list1,c2);
		System.out.println(list1);
		
		// Using comparator Using function interface and lambda expression sorting name -NextLevel
				System.out.println("Using Comparato - function interface and lambda expressions -Next Level -  Descending -Names");
				Collections.sort(list1,(s1,s2)->s2.getName().compareTo(s1.getName()));
				System.out.println(list1);
		
		
		
	}

}