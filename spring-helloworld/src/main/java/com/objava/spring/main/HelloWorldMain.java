/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.main;

import com.objava.spring.config.event.CustomEventPublisher;
import com.objava.spring.model.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author shahzad
 */
public class HelloWorldMain {

    public static void main(String[] args) {
        // Load Definition
        AbstractApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
//        String message = helloWorld.printHello();
//
//        System.out.println(message);

//        for ( String s: context.getBeanDefinitionNames()) {
//            System.out.println(s) ;
//        };
//        Person shahzad = (Person) context.getBean("shahzad");
//        Person masud = (Person) context.getBean("masud");
//
//        System.out.println(shahzad);
//        System.out.println(masud);
//
//        shahzad.getCity().setName("Model Town - Lahore");
//
//        System.out.println(shahzad);
        context.start();
//        Employee masud = (Employee) context.getBean("masud");
//        System.out.println(masud);
        
        CustomEventPublisher cep = (CustomEventPublisher) 
                context.getBean("customEventPublisher") ;
        
        cep.publish(); 
        cep.publish(); 
        
        context.stop();
//        Employee one = (Employee) context.getBean("employee1");
//        Employee two = (Employee) context.getBean("employee2");
//        System.out.println(one);
//        System.out.println(two);
//        parent.setName("change Parent");
//        System.out.println(one);
//        System.out.println(two);
//        one.setName("change one");
//        System.out.println(one);
//        System.out.println(two);
//        two.setName("change two");
//        System.out.println(one);
//        System.out.println(two);

        context.registerShutdownHook();
    }
    
    // Modify existing Chess Application with 
    // All model objects to Beans
    // All application start-up techniquest to bean config
    // All application shut-down to destroy
    // All application configuration to spring-configuration
    
    // Four 
    // @Required
    // @Autowired
    // @Qualifier
    // @Resource, @PreContruct, @PostConstruct
    
}
