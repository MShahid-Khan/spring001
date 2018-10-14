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
public class TryThread extends Thread {

    private String firstName;
    private String lastName;
    private Long delay;

    public TryThread(String firstName, String lastName, Long delay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(lastName);
                sleep(this.delay);
                System.out.println(firstName);
            } catch (Exception e) {
            }
        }
    }
    
    public static void main ( String[] args ) {
        
        Thread t1 = new TryThread("one", "1", 1000L) ;
        Thread t2 = new TryThread("two", "2", 2000L) ;
        Thread t3 = new TryThread("three", "3", 3000L) ;
        Thread t4 = new TryThread("four", "4", 4000L) ;
        
        t1.start();
        t2.start();
        t3.start();
        t4.start(); 
    }

}
