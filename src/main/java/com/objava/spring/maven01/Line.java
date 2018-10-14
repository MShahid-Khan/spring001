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
public class Line {

    Point start; //double x1, y1;
    Point end; // double x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
//        start = new Point(x1, y1) ;
//        end = new Point (x2, y2) ;
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Line(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    public Line(Line line) {
        this(line.start, line.end);
    }

    public double length() {
        return start.distance(end);
    }

    @Override
    public String toString() {
        return "Line{" + "start=" + start + ", end=" + end + ",distance=" + length() + '}';
    }

    public static void main(String[] args) {
        Line line = new Line(10, 10, 20, 20);
        System.out.println(line);
    }

}
