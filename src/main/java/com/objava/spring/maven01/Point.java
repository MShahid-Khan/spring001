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
public class Point {

    private Double x;
    private Double y;
    public static long objectCount = 0 ;

    // Default
    public Point() {
//        x = 0.0;
//        y = 0.0;
        this(0.0, 0.0);
    }

    // Argument
    public Point(double newX, double newY) {
//        x = newX;
        setX(newX);
//        y = newY;
        setY(newY);
        objectCount ++ ;
    }

    // Clone / Copy
    public Point(Point p) {
        this(p.x, p.y);
    }

    public void setX(double newX) {
        x = new Double(newX);
    }

    public double getX() {
        return x;
    }

    public void setY(double newY) {
        y = new Double(newY);
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt(
                (p.y - this.y) * (p.y - this.y)
                + (p.x - this.x) * (p.x - this.x));
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

}
