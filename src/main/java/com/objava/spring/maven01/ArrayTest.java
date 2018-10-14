/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven01;

import java.util.Arrays;

/**
 *
 * @author shahzad
 */
public class ArrayTest {

    public static void main(String[] args) {

        int[] p1 = new int[10];
        int[] p2;
        p2 = new int[10];
        int[] p3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < p1.length; i++) {
            p1[i] = 10;
        }
        
        Arrays.fill(p1, 0, 5, 10);
        Arrays.fill(p1, 5, p1.length, 20);
        
        float[][] f = new float[10][10] ;
        
        // Chess Game
        // Learn Chess Game & Implement
        // Spring01 - 0321 442 8889
    }

}
