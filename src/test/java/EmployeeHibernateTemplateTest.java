import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Department;
import com.hibernate.annotation.entity.Employee;
import com.hibernate.annotation.entity.EmployeeHibernateTest;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:hibernate.xml"})



public class EmployeeHibernateTemplateTest {

	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
//	@Test
//	public void testGetEmployeeByPk(){
//		System.out.println(hibernateTemplate);
//		
//		Employee employee =	hibernateTemplate.get(Employee.class,1);
////		query ค่าที่ออกมาจาก DB โดยใช้ spring ใช้ผ่าน hibernateTemplate
//		
//		
//		System.out.println("first name : "+employee.getFirstname());
//		System.out.println("last name : "+employee.getLastname());
//	}
//	
//	
//	@Test
//	public void testFindHSQL(){
//		
//		List< Employee>employeeList = hibernateTemplate.find("from Employee");
//		
//		for(Employee employee :employeeList){
//			System.out.println("First  Name "+employee.getFirstname()
//					+", Last  Name "+employee.getLastname()
//					+", Saraly "+employee.getSalary()
//								);
//			
//		}
//		
//	}
	
	
	@Test
	public void testFindEmployeeWithHSQLByParameter(){
		
		List<Employee>employeeList = hibernateTemplate.find("from Employee where id= ?"
				,new Integer[]{4});
		
		for(Employee employee :employeeList){
			System.out.println("First  Name "+employee.getFirstname()
					+", Last  Name "+employee.getLastname()
					+", Saraly "+employee.getSalary()
								);
			
		}
		
	}
	
		
//		@Test
//		public void testFindDepartmentWithHSQL(){
//			
//			List<Department>departmentList = hibernateTemplate.find("from Department");
//			
//			for(Department department :departmentList){
//				System.out.println("\nDepartment Name "+department.getDepartmentName());
//				
//			}
//	}
	
	
	@Test
	public void testFindEmployeeWithNameQuery(){
		
		List<Employee>employeeList = hibernateTemplate.findByNamedQuery("findAllEmployee");
		displayEmployee(employeeList);
	}
	
	@Test
	public void testFindDepartmentWithHSQL(){
		
	}
	
private void displayEmployee (List<Employee>employeeList ){
		
		
		for(Employee employee :employeeList){
			System.out.println("First  Name "+employee.getFirstname()
					+", Last  Name "+employee.getLastname()
					+", Saraly "+employee.getSalary()
								);
	}
	}

	@Test
	public  void testFindEmployeeWithCriteria(){
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Employee.class);
		criteria.add(Restrictions.eq("firstname","John"));
		List<Employee> employeeList =hibernateTemplate.findByCriteria(criteria);
		displayEmployee(employeeList);
	}


//	@Test
//	public  void testSaveEmployee(){
//		
//		Employee employee  =new Employee();
//		employee.setFirstname("parn");
//		employee.setLastname("Bred");
//		employee.setAddress("bangkok");
//
//		
//		hibernateTemplate.save(employee);
//		
//		
//		
//	}

	
	

//	@Test
//	public  void testUpdateEmployee(){
//		Employee employee =hibernateTemplate.get(Employee.class,8);
//		employee.setAddress("London");
//		hibernateTemplate.update(employee);
//		
//		
//		
//		
//		
//	}
//	
	
	
	
	
//	@Test
//	public  void testDeleteEmployee(){
//		Employee employee =hibernateTemplate.get(Employee.class,7);
//		hibernateTemplate.delete(employee);
//		
//		
//		
//		
//	}
	
}


