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
public class Dog extends Animal {

    String breed;

    public Dog() {
        this("Unknown");
    }

    public Dog(String breed) {
        super("Dog");
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + '}';
    }

    public String sound() {
        return "Bark Bark ... ";
    }

    public static void main(String[] args) {
        Dog d = new Dog("BullDog");
        Cat c = new Cat("Persian");

        Animal a = new Dog("Indian");
        Animal b = new Cat("American");

        // Anonymous / Adapter
        Animal e = new Animal("Duck") {
            @Override
            public String sound() {
                return "Quake Quake";
            }

            @Override
            public String breed() {
                return "Duck Breed";
            }
        };

        Animal[] aa = {a, b, c, d, e};
        for (Animal aaa : aa) {
            System.out.println(aaa);
        }
        
        Breed[] bb = {a, b, c, d, e};
        for (Breed bbb : bb) {
            System.out.println(bbb.breed());
        }

        // Assignment #3
        // Date Input: 23/09/2018, 2018/09/23, Sep-23-2018, 
        // September 23 2018
        // Date Output: 23-Sep-2018
    }

    @Override
    public String breed() {
        return "Dog Breed: " + this.breed;
    }

}
