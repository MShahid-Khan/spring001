/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

import java.util.Observable;

/**
 *
 * @author shahzad
 */
public class Teacher extends Observable {

    private String studentName = "Default";

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addAssignment(String studentName) {
        setStudentName(studentName);
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Teacher{" + "studentName=" + studentName + '}';
    }

}
