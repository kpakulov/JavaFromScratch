package ru.kpakulov.square;

/**
 *  Class Square which calculates the quadratic equation y = a*x2 + b * x + c .
 *
 *  @author Konstantin Pakulov
 *  @version 11/9/2016
 */
public class Square {

    /**
     * hahaha.
     */
    private double a;
    /**
     * hahaha.
     */
    private double b;
    /**
     * hahaha.
     */
    private double c;

    /**
     * hahaha.
     * @param a pam pam
     * @param b pam pam
     * @param c pam pam
     */
    public Square(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * hahaha.
     *
     * @param x pam pam
     *
     * @return something
     */
    public double quadraEq(int x) {
        return (this.a * Math.pow(x, 2) + this.b * x + this.c);

    }

    /**
     * hahaha.
     * @param args pam pam
     */
    public void show(String[] args) {

        int xlow = Integer.valueOf(args[0]);
        int xhigh = Integer.valueOf(args[1]);
        int step = Integer.valueOf(args[2]);

        for (int i = xlow; i <= xhigh; i = i + step) {
            System.out.println(quadraEq(i));
        }
    }
}