package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMain {

	public static void main(String... strings) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(0);
		list.add(5);
		list.add(4);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("----Complex List Sorting----");
	
		List<Product> list2 = new ArrayList<Product>();
		list2.add(new Product(1, "shampoo" , 1000.0));
		list2.add(new Product(4, "soap" , 100.0));
		list2.add(new Product(2, "conditioner" , 2000.0));
		list2.add(new Product(3, "towel" , 500.0));
		
		Collections.sort(list2);
		
		for(int i=0;i<list2.size();i++)
		{
		
			System.out.println(list2.get(i));
		}
			
		
		
	}
	
	
}