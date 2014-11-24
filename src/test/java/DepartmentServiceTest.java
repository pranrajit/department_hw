import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Department;
import com.training.spring.service.DepartmentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:hibernate.xml"})


public class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Test
	public void testFindDepartmentId()throws Exception{
		Department department = departmentService.findDepartment(2);
		System.out.println(department);
	}
	
//	@Test
//	public void testFindAll(){
//		List<Department>department=departmentService.findAllDepartment();
//		System.out.println(department);
//	}
	
	@Test
	public void InsertDepartment(){
		Department department=new Department();
		department.setDepartmentName("Training");
		departmentService.insertDepartment(department);
	}
	
//	@Test
//	public void UpdateDepartment(){
//		Department department = departmentService.findDepartment(2);
//		department.setDepartmentName("Sale");
//		departmentService.updateDepartment(department);
//	}
	
//	@Test
//	public void DeleteDepartment(){
//		Department department =departmentService.findDepartment(4);
//		departmentService.deleteDepartment(department);
//	}
}
