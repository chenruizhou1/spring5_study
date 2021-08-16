package model;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @author chenruizhou
 */
public class TestClass {

    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("myFactoryBean", User.class);
        System.out.println(user);
    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Camp camp = applicationContext.getBean("camp", Camp.class);
        System.out.println("4---获取到bean的实例化对象 " + camp);
        applicationContext.close();
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.addUser();
    }

    /**
     * 测试AOP
     */
    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
        Equipment equipment = applicationContext.getBean("equipment", Equipment.class);
        equipment.print();
    }

}
