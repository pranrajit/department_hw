package com.training.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hibernate.annotation.entity.Employee;




@Repository
public class EmployeeDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public Employee findEmployeeById(Integer id){
		return hibernateTemplate.get(Employee.class, id);
	}

	
	public List<Employee> findAllEmployee(){
		return hibernateTemplate.find("from Employee");
	}
	
	
//	public void saveEmployee(Employee employee){
//		hibernateTemplate.save(employee);
//	}
	
	
//	public void updateEmployee(Employee employee){
//		hibernateTemplate.update(employee);;
//	}
//	
//	public void deleteEmployee(Employee employee){
//		hibernateTemplate.delete(employee);
//	}
}
