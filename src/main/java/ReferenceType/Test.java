package ReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("RefConfig.xml");
        A a = (A)context.getBean("a");
        A a2 = (A)context.getBean("a2");
        System.out.println(a);
        System.out.println(a2);
    }
}
