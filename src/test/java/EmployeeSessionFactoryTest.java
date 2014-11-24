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

import com.hibernate.annotation.entity.Employee;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:hibernate.xml"})

public class EmployeeSessionFactoryTest {

	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Test
	public void testGetSessionFromSessionFactory(){
		
		Session session=sessionFactory.openSession();
		
		Employee employee =(Employee)session.get(Employee.class,1);
		
		System.out.println(employee);
		
		session.close();
		
		
	}
	
	
	@Test
	public void testFindHQLFirstname(){
		
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		List<Employee> result = session.createQuery("FROM Employee e WHERE e.firstname='John' and e.id=1").list();
		
		System.out.println("Firstname: "+result);
		session.close();
		
		
	}
	
	
	@Test
	public void testFindCriteriaByFirstNameAndLastName(){
		
		Session session = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		
		criteria.add(Restrictions.eq("firstname", "John"));     //like("firstname", "%"+fName));
		criteria.add(Restrictions.eq("lastname", "Bred")); 
		List<Employee> employeeList =criteria.list();
		
		System.out.println(employeeList);
	

		session.close();
		
		
	}
	
	
	
	@Test
	public void testFindByNameQuery(){
		
		Session session = sessionFactory.openSession();

		List<Employee> allEmployee =session.getNamedQuery("findAllEmployee").list();
		System.out.println(allEmployee);
		
		session.close();
		
	}
	
	
}


