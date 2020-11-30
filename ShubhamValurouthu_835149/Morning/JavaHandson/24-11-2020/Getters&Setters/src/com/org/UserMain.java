package com.org;


import java.util.ArrayList;
import java.util.List;

public class UserMain {
	
	public static void main(String... args) {
		
	List<User> list = new ArrayList<User>();
	
	User cred1  =new User("1", "Kartik", "123");
	User cred2  =new User("2", "Sai", "345");
	User cred3  =new User("3", "Ranjeet", "674");
	User cred4  =new User("4", "Shubham", "852");
	User cred5  =new User("5", "Vignesh", "111");
	
	
	
	list.add(cred1);
	list.add(cred2);
	list.add(cred3);
	list.add(cred4);
	list.add(cred5);
	
	

	for(int i =0 ;i<list.size();i++)
	{
		if(list.get(i).getName().length()>5) {
			
			System.out.println("Id: "+list.get(i).getId()+" Name: "+list
					.get(i).getName());
			
		}
		
		
	}
	
	
	
	
	}
}