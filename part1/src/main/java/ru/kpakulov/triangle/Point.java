package ru.kpakulov.triangle;

//re-written using setters and getters


public class Point {
// Declaring private variables x,y which are not visible from outside the class
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }       

// Reading the private variable and "sending" it outside as visible
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
// The method distanceTo returns its result as public
// It is important to understand that the argument (Point point) is NOT a variable, but a _reference_ to an object
    public double distanceTo(Point point) {
        //calculate distance between two points
        
         return Math.sqrt(Math.pow(point.getY() - this.y, 2) + Math.pow(point.getX() - this.x, 2));
         
//      return -1;
    }

}

