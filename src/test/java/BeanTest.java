
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.training.spring.bean.ExampleComponent;
import com.training.spring.bean.Hello;
import com.training.spring.bean.Humen;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BeanTest {
	
	@Autowired
	private Hello hello;
	
	
	@Autowired
	private Humen humen;
	
	@Autowired
	private ExampleComponent exampleComponent;
	

//		@Test // ต้องใส่ไม่งั้นรันไม่ได้
//		public void testSimpleBean() {
//			System.out.println("#### This is test for Simple Bean ##");
//			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//			Hello hello = (Hello)context.getBean("hello");
//			System.out.println("######### Hello ############");
//			System.out.println("hello : "+hello);
//			
//		}
		
//	testSimpleBean() กับ testAutowiredBean() ให้ค่าเหมือนกัน เเต่อันล่างง่ายกว่า เเต่อันล่างก้อต้องประกาศ
//	@Autowired  private Hello hello; ก่อน
	
	
		@Test
		public void testAutowiredBean() {
			System.out.println("######### Autowired Hello ############");
			System.out.println(hello);

		}
		
		
		@Test
		public void testAutowiredBean2() {
			System.out.println("######### Autowired Humen ############");
			System.out.println(humen);

		}
		
		
		
		@Test
		public void testExampleComponent(){
		
			System.out.println("Show message : "+exampleComponent);
			System.out.println("\nShow Hello : "+exampleComponent.getHello());
			System.out.println("\nShow Humen : "+exampleComponent.getHumen());
			System.out.println("\nShow message : "+exampleComponent.getMessage());
			System.out.println("\nShow message1 : "+exampleComponent.getMessage1());
		}
}
