/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.main;

import com.objava.spring.config.SpringConfig;
import com.objava.spring.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 *
 * @author shahzad
 */
public class HWMainConfig {

    public static void main(String[] args) {
        AbstractApplicationContext ctx 
                = new AnnotationConfigApplicationContext(SpringConfig.class);

        Person shahzad = ctx.getBean(Person.class);
        System.out.println(shahzad);
        ctx.registerShutdownHook() ;
    }
}
