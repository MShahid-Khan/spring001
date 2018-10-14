/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahzad
 */
public class TestSerialization {

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            // Write
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("c:/serial.txt"));
            out.writeObject(new Person(1, "shahzad", 10.0f));
            out.close();

            // Read 
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("c:/serial.txt"));
            Object o = in.readObject();
            System.out.println(o);
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(TestSerialization.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
