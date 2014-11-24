import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Department;
import com.hibernate.annotation.entity.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:hibernate.xml"})

public class DepartmentSessionFactoryTest {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Test
	public void testGetSessionFromSessionFactory(){
		
		Session session=sessionFactory.openSession();
		
		Department department =(Department)session.get(Department.class,2);
		
		System.out.println(department);
		
		session.close();
		
		
	}
	
	
	@Test
	public void testFindHQLDepartmentname(){
		
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		List<Employee> result = session.createQuery("FROM Department").list();
		
		System.out.println("DepartmentName: "+result);
		session.close();
		
		
	}
	
	
	
	
}
