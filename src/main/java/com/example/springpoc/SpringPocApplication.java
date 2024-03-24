package com.example.springpoc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPocApplication {

    public static void main(String[] args) {
        System.out.println("Welcome To Spring");
        ApplicationContext contextBean = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) contextBean.getBean("student");
        Student student2 = (Student) contextBean.getBean("student2");
        Student student3 = (Student) contextBean.getBean("student3");

        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
    }

}
