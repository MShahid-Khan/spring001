/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven01;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.isLowerCase;

/**
 *
 * @author shahzad
 */
public class LetterTest {

    public static void main(String[] args) {
//
//        Integer i = 1;
//        Float f = 0.0f;
//        Long l = 10L;
//        Double d = 10.0;
//        Boolean b = false;
//        Short s = 12;
        Character c = 'A';
//
//        if (isUpperCase(c)) {
//            System.out.println("Upper");
//        } else if (isLowerCase(c)) {
//            System.out.println("Lower");
//        }

        int i, j;
        i = j = 0;
        if (i == 0) {
            j = i + 1;
        } else {
            j = i;
        }
        j = (i == 0) ? i + 1 : i;
        System.out.println(isUpperCase(c)
                ? Character.isWhitespace(c)? "" : "Upper" 
                : isLowerCase(c) ? "Lower" : "");
    }
}
