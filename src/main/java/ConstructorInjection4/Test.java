package ConstructorInjection4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CIConfig.xml");
        Student std = (Student) context.getBean("student");
        System.out.println(std);
    }
}
