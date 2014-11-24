import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate3.HibernateTemplate;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Department;
import com.hibernate.annotation.entity.Employee;
import com.training.spring.service.EmployeeService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:hibernate.xml"})

public class EmployeeServiceTest {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private HibernateTemplate hibernateTemple;
	
	
	@Test
	public void testFindEmployeeIdShoudFoundData()throws Exception{
		
		Employee employee =employeeService.findEmployee(1);
		System.out.println(employee);
		
	}
	
	@Test
	public void testFindAllShouldFoundData(){
		List<Employee> employee = employeeService.findAllEmployee();
		System.out.println(employee);
		
	}
	
	
//	@Test
//	public void InserEmployee(){
//		Department department = hibernateTemple.get(Department.class, 1);
//		Employee employee = new Employee("Aa","Bb",department);
//		employeeService.insertEmployee(employee);
//		
//		
//	}
	
//	

//	@Test
//	public void UpdateEmployee()throws Exception{
//		Employee employee =employeeService.findEmployee(7);
//	
//		employeeService.updateEmployee(employee);
//		
//		
//	}
	
//	@Test
//	public void DeleteEmployee()throws Exception{
//		Employee employee =employeeService.findEmployee(7);
//	
//		employeeService.deleteEmployee(employee);
//		
//		
//	}
	
	
	
	

}
