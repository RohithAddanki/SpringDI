package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Constructor Dependency Injection
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Constructor Injection:");
        System.out.println(employee);

        // Setter Dependency Injection with Autowiring
        Course course = (Course) context.getBean("course");
        System.out.println("\nSetter Injection with Autowiring:");
        System.out.println(course);
    }
}