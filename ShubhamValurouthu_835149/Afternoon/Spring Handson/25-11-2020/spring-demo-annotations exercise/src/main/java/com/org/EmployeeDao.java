package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	private DbConfig dbConfig;
	
	
	public void store() {
		System.out.println("store() method in DAO layer");
	}
}