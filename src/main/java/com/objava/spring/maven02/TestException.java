/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

/**
 *
 * @author shahzad
 */
public class TestException {

    public static void main(String[] args) {
        int number = 0;
        try {
            number = getInt("123");
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getInt(String str)
            throws Exception, NumberFormatException {
        try {
            return Integer.parseInt(str);
//        } catch (Exception e) {
//            throw new NumberFormatException(e.getMessage());
        } finally {
            System.out.println("Execute in all cases");
        }
    }
}
