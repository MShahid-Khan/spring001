/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.config;

import com.objava.spring.model.City;
import com.objava.spring.model.Employee;
import com.objava.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author shahzad
 */
@Configuration
@Import(SpringConfigB.class)
public class SpringConfig {
    
    @Bean (initMethod = "init", destroyMethod = "destroy")
    @Scope (value = "prototype")
    public Employee masud() {
        return new Employee("Shahzad");
    }
    
    @Bean 
    public City city() {
        return new City("Lahore");
    }
}
