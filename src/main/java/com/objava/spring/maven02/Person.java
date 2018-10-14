/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

import java.io.Serializable;

/**
 *
 * @author shahzad
 */
public class Person implements Serializable {

    private Integer id;
    private String name;
    private Float number;

    public Person(Integer id, String name, Float number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", number=" + number + '}';
    }

}
