package com.springdemo;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDaoImpl dao ;
	
	public EmployeeDaoImpl getDao() {
		return dao;
	}


	public void setDao(EmployeeDaoImpl dao) {
		this.dao = dao;
	}


	public void storeEmployee(){
		
		System.out.println("StoreEmployee method of EmployeeService");
		dao.store();
		
	}
	}
