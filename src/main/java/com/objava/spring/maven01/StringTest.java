/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven01;

import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class StringTest {

    public static void main(String[] args) {

        String n1 = "shahzad"; // 22
        String n2 = "shahzad"; // 8
        String n3 = new String("shahzad"); // 16

        if (n1 == n2) ; // Ref True
        if (n1 == n3) ; // Ref False
        if (n1.equals(n3)) ; // Val True

        n1 = null;
        n2 = null;
        n3 = null;
        System.gc();

        Scanner scan = new Scanner(System.in);
        // Explore java.lang.String
        // Searching
        // Split 
        // SubString
        // Trim
        
        // Assignment #2 
        // input:  a quick brown fox jumps over the lazy doog
        // output: a kciuq nworb xof spmuj revo eht yzal good

    }

}
