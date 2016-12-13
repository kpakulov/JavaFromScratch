package ru.kpakulov.quadratic;

/**
 *  Class Quadratic.
 *  Calculates the quadratic equation y = a*x2 + b * x + c
 *
 *  @author Konstantin Pakulov
 *  @version 11/04/2016
 */
public class Quadratic {

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
     * @param a pam pam.
     * @param b pam pam.
     * @param c pam pam.
     */
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
        /**
         * hahaha.
         * @param x pam pam.
         * @return  ahahaha.
         */
        public double quadraEq(int x) {
        return (this.a * Math.pow(x, 2) + this.b * x + this.c);
   }

        /**
         * hahaha Main as it is.
         * @param args for Args.
         */
    public static void main(String[] args) {

    /**
     * Mandatory javadoc.
     */
    final int indexZero = 0;

    /**
     * Mandatory javadoc.
     */
    final int indexOne = 1;

    /**
     * Mandatory javadoc.
     */
    final int indexTwo = 2;

    /**
     * Mandatory javadoc.
     */
    final int indexThree = 3;

    /**
     * Mandatory javadoc.
     */
    final int indexFour = 4;

    /**
     * Mandatory javadoc.
     */
    final int indexFive = 5;

        double a = Double.valueOf(args[indexZero]);
        double b = Double.valueOf(args[indexOne]);
        double c = Double.valueOf(args[indexTwo]);

        int xlow = Integer.valueOf(args[indexThree]);
        int xhigh = Integer.valueOf(args[indexFour]);
        int step = Integer.valueOf(args[indexFive]);

        Quadratic quadratic = new Quadratic(a, b, c);
        for (int i = xlow; i <= xhigh; i = i + step) {
            System.out.println(quadratic.quadraEq(i));
        }
    }
}