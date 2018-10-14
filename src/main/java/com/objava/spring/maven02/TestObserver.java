/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

import java.util.Observer;

/**
 *
 * @author shahzad
 */
public class TestObserver {

    public static void main(String[] args) throws InterruptedException {

        Teacher t = new Teacher();

        Observer[] students = {
            new Student("ahmed", "ahmed@gmail.com"),
            new Student("second", "second@email.com"),
            new Student("third", "third@email.com")
        };

        // Bind
        for (Observer o : students) {
            t.addObserver(o);
        }

        while (true) {
            t.addAssignment("Assignment: "
                    + System.currentTimeMillis());
            Thread.sleep(4000);
        }
    }

}
