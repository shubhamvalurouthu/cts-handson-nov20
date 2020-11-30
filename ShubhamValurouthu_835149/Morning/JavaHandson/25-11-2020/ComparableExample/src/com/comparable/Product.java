package com.comparable;

public class Product implements Comparable<Product> {
	 Integer id; 
	 String name;
	 Double price;
	 
	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return  "id = "+id +  " name = " + name + " price = "+price ;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.id - o.getId();
	}
		
		
	}