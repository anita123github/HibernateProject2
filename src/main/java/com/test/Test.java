package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		 session.beginTransaction();

		// insert data into database
		Employee employee=new Employee();
		employee.setFullName("Sanvi ankush mallav");
		employee.setAddress("pune");
		employee.setSalary(35000);
		
		Employee employee1=new Employee();
		employee1.setFullName("vinod patil");
		employee1.setAddress("solapur");
		employee1.setSalary(55000);
		
		Employee employee2=new Employee();
		employee2.setFullName("shital Gharjale");
		employee2.setAddress("mumbai");
		employee2.setSalary(45000);
		
		session.save(employee);
		session.save(employee1);
		session.save(employee2);
		
		Transaction transaction=session.getTransaction();
		transaction.commit();
		session.close();
		System.out.println("Record saved successfully.");

		
	}

}
