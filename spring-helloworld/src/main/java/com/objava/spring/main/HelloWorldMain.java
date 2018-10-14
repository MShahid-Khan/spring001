/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.main;

import com.objava.spring.model.HelloWorld;
import com.objava.spring.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author shahzad
 */
public class HelloWorldMain {

    public static void main(String[] args) {
        // Load Definition
        ApplicationContext context
                = new ClassPathXmlApplicationContext
        ("applicationContext.xml");
//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
//        String message = helloWorld.printHello();
//
//        System.out.println(message);

        Person shahzad = (Person) context.getBean("shahzad");
        Person masud = (Person) context.getBean("masud");

        System.out.println(shahzad);
        System.out.println(masud);

        shahzad.getCity().setName("Model Town - Lahore");

        System.out.println(shahzad);
        System.out.println(masud);

    }
}
