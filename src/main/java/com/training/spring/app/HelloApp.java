package com.training.spring.app;

import com.training.spring.bean.ExampleComponent;
import com.training.spring.bean.Hello;
import com.training.spring.bean.Humen;
import org.hibernate.criterion.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date: 10/31/2014
 * Time: 3:21 PM
 *
 * @author assanai.manurat
 */
public class HelloApp {

    public static void main(String[] args) {

        loadXmlClasspathApplicationContext();
    }

    private static void loadXmlClasspathApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        System.out.println("############### Hello ###################");
        System.out.println("hello : " + hello);
        System.out.println("hello.humen : " + hello.getHumen());


        
        
//        cast เปลี่ยน Type ให้ตรงกัน
        System.out.println("############### Humen ###################");
        Humen humen = (Humen) context.getBean("humen");
        System.out.println("humen : "+ humen);

//        ปลอดภัยกว่า cast เพราะcast เราอาจพิมผิดได้
        System.out.println("############### Humen Object ###################");
        Humen humenObj = context.getBean(Humen.class);
        System.out.println("humenObj : "+ humenObj);
        
        
        System.out.println("Display humen firstname : "+hello.getHumen().getFirstName());
        System.out.println("Display humen lastname : "+hello.getHumen().getLastName());
        
        
        
        
        
        
        //สร้าง hello ใน humen ต้องไปกำหนดค่าในหน้า  bean ด้วย เเละสร้างhello ในhumenด้วย        
        System.out.println("Display hello age : "+humen.getHello().getAge());
        System.out.println("Display hello  : "+humen.getHello().getMessage());
        
        

//        ExampleComponent component = context.getBean(ExampleComponent.class);
//        System.out.println("component : " + component);
    }
}
