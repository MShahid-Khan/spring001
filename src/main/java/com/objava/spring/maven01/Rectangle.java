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
public class Rectangle {

    private Line width, height;

    public Rectangle() {
    }

    public Rectangle(Line width, Line height) {
        this.width = new Line(width);
        this.height = new Line(height);
    }
    
    public double area ( ) {
        return width.length() * height.length() ;
    }

    
}
