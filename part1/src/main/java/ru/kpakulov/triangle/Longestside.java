package ru.kpakulov.triangle;

/**
 * This class will find the longest side of a given triangle.
 */

public class Longestside {

	/**
	 * Return The length of the longest side of the triangle.
	 * @param triangle a sample triangle
	 * @return The length of the longest side
     */
	public double max(Triangle triangle) {
		double result = 0.0;
		if (triangle.area() > 0.0) {
			if (triangle.getSideOne() > triangle.getSideTwo() && triangle.getSideOne() > triangle.getSideThree()) {
				result = triangle.getSideOne();
			} else if (triangle.getSideTwo() > triangle.getSideOne() && triangle.getSideTwo() > triangle.getSideThree()) {
				result = triangle.getSideTwo();
//			} else if (triangle.getSideOne == triangle.getSideTwo && triangle.getSideOne() == triangle.getSideThree()) {
//				result = -1;
			}
			result = triangle.getSideThree();
		}
	return result;
	}
}