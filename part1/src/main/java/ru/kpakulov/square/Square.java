package ru.kpakulov.quadratic;

/**
 *  Class Square which calculates the quadratic equation y = a*x2 + b * x + c
 *
 *  @author Konstantin Pakulov
 *  @version 11/9/2016
 */
public class Square {
    
    private double a;
    private double b;
    private double c;
    
    public Square (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;     
    }

    
    public double quadraEq(int x){
        return (this.a * Math.pow(x, 2) + this.b * x + this.c);
        
    }
    
    public void show(String[] args){
        
        int xlow = Integer.valueOf(args[0]);
        int xhigh = Integer.valueOf(args[1]);
        int step = Integer.valueOf(args[2]);
        
        for(int i = xlow; i <= xhigh; i = i + step){
            System.out.println(quadraEq(i));
        }
    }
}