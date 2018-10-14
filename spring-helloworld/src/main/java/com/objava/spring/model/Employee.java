/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.model;

import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author shahzad
 */
public class Employee extends Person implements InitializingBean {

    int employeeNumber;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeNumber=" + employeeNumber + '}' + super.toString();
    }

    public void init() {
        System.out.println("---- Init Employee ...");
    }

    public void destroy() {
        System.out.println("---- Destroy ..");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Property Set ... ");
    }

}
