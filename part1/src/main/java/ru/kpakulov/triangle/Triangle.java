package ru.kpakulov.triangle;

import static java.lang.Math.sqrt;

/**
 * This class is a blueprint of a triangle which can be created using three points.
 * In this example all class variables are public
 */

public class Triangle {

    /**
     * hahaha.
     * a, b, and c are NOT variables, but _references_ to type Point _objects_
     */
    private Point a;

    /**
     * hahaha b.
     */
    private Point b;

    /**
     * hahaha c.
     */
    private Point c;

    /**
     * Three sides of a triangle - in this case these are _variables_, not references.
     */
    private double sideOne;

    /**
     * hahaha b.
     */
    private double sideTwo;

    /**
     * hahaha b.
     */
    private double sideThree;

    /**
     * Creating a new triangle using three points.
     * @param a first point
     * @param b second point
     * @param c third point
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * hahaha One.
     * @return sideOne
     */
    double getSideOne() {
    return sideOne;
    }

    /**
     * hahaha Two.
     * @return sideTwo
     */
    double getSideTwo() {
    return sideTwo;
    }

    /**
     * hahaha Three.
     * @return sideThree
     */
    double getSideThree() {
    return sideThree;
    }

    /**
     * Calculating the area of the triangle.
     * @return the area of the triangle
     */
    public double area() {
        double result = 0.0;
        if (canExist()) {
            double halfPerimeter = (sideOne + sideTwo + sideThree) / 2;
            result = sqrt(halfPerimeter * (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree));
        }
        return result; //return ZERO for a non-existing triangle
    }

    /**
     * A simple check of a possibility for a triangle to exist.
     * One of the sides must be bigger than the sum of two other sides.
     * @return true if the triangle is possible; false otherwise. sideOne-sideThree are calculated as well
     */
    private boolean canExist() {
        boolean result = false;
        sideOne = a.distanceTo(b);
        sideTwo = b.distanceTo(c);
        sideThree = c.distanceTo(a);

        if (sideOne + sideTwo > sideThree) {
            result = true;
        } else if (sideOne + sideThree > sideTwo) {
            result = true;
        } else if (sideTwo + sideThree > sideOne) {
            result = true;
        }
        return result;
    }
}