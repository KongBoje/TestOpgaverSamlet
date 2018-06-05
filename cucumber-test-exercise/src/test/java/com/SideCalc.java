package com;

public class SideCalc {

    public String calcSides(int a, int b, int c) {
        if (isValid(a, b, c)) {
            return findTriangle(a, b, c);
        }
        return "This is not a triangle";
    }

    public String findTriangle(int a, int b, int c) {
        if (isEquilateral(a, b, c)) {
            return "This is an equilateral triangle";
        } else if (isIsoscele(a, b, c)) {
            return "This is an isoscele triangle";
        } else {
            return "This is a scalene triangle";
        }
    }

    public boolean isValid(int a, int b, int c) {
        return (a + b > c && b + c > a && a + c > b);
    }

    public boolean isEquilateral(int a, int b, int c){
        return (a == b && b == c);
    }

    public boolean isIsoscele(int a, int b, int c){
        return (a == b || b == c || a == c);
    }

}