package org.example;

public class IsoscelesTrapezoid {
    private double base1;
    private double base2;
    private double height;
    private double side;


    public IsoscelesTrapezoid(double base1, double base2, double height, double side) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side = side;
    }


    public double calculateArea() {
        return ((base1 + base2) / 2) * height;
    }


    public double calculatePerimeter() {
        return base1 + base2 + 2 * side;
    }


    public boolean isIsosceles() {
        return base1 != base2 && side > 0 && height > 0;
    }


    public boolean canExist() {
        return height > 0 && base1 > 0 && base2 > 0 && side > 0 && side >= Math.abs(base1 - base2) / 2;
    }


    public void setHeight(double height) {
        this.height = height;
    }
}


