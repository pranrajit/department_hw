package com.training.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.annotation.entity.Department;
import com.training.spring.dao.DepartmentDao;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	public Department findDepartment(Integer id){
		return departmentDao.findDepartmentById(id);
	}

	
//	public List<Department> findAllDepartment(){
//		return departmentDao.findAllDepartment();
//	}
	
//	public void insertDepartment(Department department){
//		departmentDao.saveDepartment(department);
//	}

	

//	public void updateDepartment(Department department) {
//	departmentDao.updateDepartment(department);
//		
//	}
	
	
//	public void deleteDepartment(Department department) {
//		departmentDao.deleteDepartment(department);
//		
//	}
	
}
