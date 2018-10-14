/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author shahzad
 */
public class TestProperties {

    public static void main(String[] args) throws IOException {

        //Properties prop = System.getProperties() ;
        Properties prop = new Properties();
        // loading
        prop.load(new FileInputStream("c:/prop.txt"));

        // Get
        String userDir = prop.getProperty("user.dir");

        // Update
        prop.setProperty("user.dir", "c:/shahzad");
//        prop.setProperty("my.property", "shahzad");
        prop.remove("my.property");

        prop.store(new FileOutputStream("c:/prop.txt"),
                "My Spring Properties");

        prop.list(System.out);

        // Assignment: 
        // Modify Chess game to save state of users.
        // Load state of users upon running game again
    }

}
