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
public class VariableTest {

    public static void main(String[] args) {

        // Camel case with small letter at beginning.
        // $, _ as starting letter
//        int a = 1 ;
//        float f = 10.0F ;
//        long l = 3433434322323L ;
//        char aa = 97 ; // 'a' ;
//        short s1 = 10 ;
//        int a = 1 ; 
//        float b = 1 ;
//        long c = 1 ;
//        double d = 1 ;
//        short s1 = 1, s2 = 1 ;
//        
//        s1 = (short) (s1 + s2) ;
//        c = (long) (a + b) ;
//        b = a + c ;
//        
        int a, b, c, d, e, f;
        a = b = c = d = e = f = 1;
//        a += b += c += d += e += f += 1;
        f = a++ + b++ + c++ + d++ + ++d + ++c + f++;
        //  1     1     1     1       3     3   1
        System.out.println(f);

    }
}
