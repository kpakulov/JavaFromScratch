package ru.kpakulov.quadratic;

/**
 *  Class Quadratic which calculates the quadratic equation y = a*x2 + b * x + c
 *
 *  @author Konstantin Pakulov
 *  @version 11/04/2016
 */
public class Quadratic {
    
    private double a;
    private double b;
    private double c;
    
    public Quadratic (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;     
    }

    
    public double quadraEq(int x){
        return (this.a * Math.pow(x, 2) + this.b * x + this.c);
        
    }
    
    public static void main(String[] args){
        
        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);
        double c = Double.valueOf(args[2]);
        
        int xlow = Integer.valueOf(args[3]);
        int xhigh = Integer.valueOf(args[4]);
        int step = Integer.valueOf(args[5]);
        
        Quadratic quadratic = new Quadratic(a, b, c);
        for(int i = xlow; i <= xhigh; i = i + step){
            System.out.println(quadratic.quadraEq(i));
        }
    }
}