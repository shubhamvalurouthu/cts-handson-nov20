package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {
		// new approach, assuming this is a service layer

				// reads the xml file and creates all the objects of the classes you have
				// configured
				ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
				EmployeeServiceImpl service = (EmployeeServiceImpl) context.getBean("service");
				service.storeEmployee();
			

	}

}
