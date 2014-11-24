package com.training.spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.annotation.entity.Employee;
import com.training.spring.dao.EmployeeDao;


@Service
public class EmployeeService {
	

	@Autowired
	private EmployeeDao employeeDao;

	public Employee findEmployee(Integer id) {
		return employeeDao.findEmployeeById(id);
		
	}
	
	public List<Employee> findAllEmployee() {
		return employeeDao.findAllEmployee();
		
	}
	
//	public void insertEmployee(Employee employee){
//		 employeeDao.saveEmployee(employee);
//		
//	}
	
//	public void updateEmployee(Employee employee){
//		 employeeDao.updateEmployee(employee);
//		
//	}
	
//	public void deleteEmployee(Employee employee){
//		 employeeDao.deleteEmployee(employee);
//		
//	}
//		
		
//		findEmployeeById
//		findAllEmployee
//      save
//		update
//		delete
	


}
