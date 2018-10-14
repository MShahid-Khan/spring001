/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

import com.objava.spring.maven01.Point;

/**
 *
 * @author shahzad
 */
public class TestArgs {

    public static void main(String[] args) {
        print(2);
        print(2, "two", 4, "four", new Point());
        print(25, "Anthing", true, 4E4, 12.2, 121312313123L);
    }

    public static void print(int bb, Object... args) {
        for (Object o : args) {
            System.out.println(o);
        }
    }

}
