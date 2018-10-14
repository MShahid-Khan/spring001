/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.model;

/**
 *
 * @author shahzad
 */
public class HelloWorld {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printHello() {
        return "Hello World ...";
    }

    public HelloWorld() {
    }

    public HelloWorld(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorld{" + "name=" + name + '}';
    }

}
