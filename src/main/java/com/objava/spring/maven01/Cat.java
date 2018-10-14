/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven01;

/**
 *
 * @author shahzad
 */
public class Cat extends Animal {

    String breed;

    public Cat() {
        this("Unknown");
    }

    public Cat(String breed) {
        super("Cat");
        this.breed = breed;
    }

    public String sound() {
        return "Meewoo";
    }

    @Override
    public String breed() {
        return "Cat Breed: " + this.breed;
    }
}
