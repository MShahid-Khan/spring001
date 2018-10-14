/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author shahzad
 */
public class Student implements Observer {

    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(" This change belongs to: "
                + ((Teacher) o).getStudentName() + "[" + this.name + "]");
    }

}
