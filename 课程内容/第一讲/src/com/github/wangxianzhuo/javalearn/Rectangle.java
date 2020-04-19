package com.github.wangxianzhuo.javalearn;

/**
 * description: Rectangle
 * date: 2020/4/19 8:25
 *
 * @author: shangjie
 * @version: 1.0
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getCircumference() {
        return (this.length + this.width) * 2;
    }
}
