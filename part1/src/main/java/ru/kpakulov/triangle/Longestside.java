package ru.kpakulov.triangle;

// This class will find the longest side of a given triangle

public class Longestside {

	/**
	 * Return The length of the longest side of the triangle
	 * @param A sample triangle
	 * @return The length of the longest side
     */
	public double max(Triangle triangle) {
		double result = 0.0;
		if(triangle.area() > 0.0) {
			if(triangle.sideOne > triangle.sideTwo && triangle.sideOne > triangle.sideThree)
				result = triangle.sideOne;
			else if (triangle.sideTwo > triangle.sideOne && triangle.sideTwo > triangle.sideThree)
				result = triangle.sideTwo;
			else
				result = triangle.sideThree;
		}
		return result;
	}

}
