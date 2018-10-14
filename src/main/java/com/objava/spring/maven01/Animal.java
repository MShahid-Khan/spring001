/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven01;

import com.objava.spring.maven02.Breed;

/**
 *
 * @author shahzad
 */
public abstract class Animal implements Breed {

    public String type;

    public Animal() {
        this("Unknown");
    }

    public Animal(String type) {
        this.type = type;
    }

    public abstract String sound() ;
//    {
//        return "Unknown";
//    }

    @Override
    public String toString() {
        return "Animal{" + "type=" + type + '}';
    }

}
