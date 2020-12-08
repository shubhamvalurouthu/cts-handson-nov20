package com.example.springbootexercise1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootexercise1.dao.EmployeeDao;
import com.example.springbootexercise1.dao.EmployeePojo;
import com.example.springbootexercise1.exception.EmployeeNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;

	public List<EmployeePojo> displayAll() {
		return dao.displayAll();
	}

	@SuppressWarnings("static-access")
	@Override
	public Optional<EmployeePojo> findEmployee(int id) throws EmployeeNotFoundException {

		if (dao.findEmployee(id).empty() != null)
			throw new EmployeeNotFoundException("Employee Does Not Exist");

		return dao.findEmployee(id);

	}

	@Override
	public EmployeePojo addEmployee(Integer id, String name, Double salary) {

		EmployeePojo employee = dao.addEmployee(id, name, salary);
		return employee;

	}

	@Override
	public EmployeePojo updateEmployee(Integer id, Double salary) throws EmployeeNotFoundException {

		Optional<EmployeePojo> employee = findEmployee(id);

		EmployeePojo employeeUpdate = dao.updateEmployee(id, employee.get().getName(), salary);
		return employeeUpdate;

	}

	@Override
	public EmployeePojo deleteEmployee(Integer id) throws EmployeeNotFoundException {

		Optional<EmployeePojo> employeecheck = findEmployee(id);

		dao.deleteEmployee(id);
		return null;

	}

}