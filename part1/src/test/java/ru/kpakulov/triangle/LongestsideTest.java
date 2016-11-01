package ru.kpakulov.triangle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * A unit test for the class Triangle.class
 * Testing the method distanceTo wich calculates the distance between two given points
 * 
 * @author kpakulov
 * @version 10/14/2016
 */

public class LongestsideTest {

	
	@Test
	public void whenGiveMaxsideObjectCorrectTriangleShouldGetLengthOfMaxSideInTriangle() throws Exception {
		//Creating the object and initializing variables
		Triangle possibleTriangle = new Triangle(new Point(14.0,0.0), new Point(8.0,12.7), new Point(36.4,28.0));
		double expectedLength = 35.85;
		Longestside longestSide = new Longestside();
		
		double actualLength = longestSide.max(possibleTriangle);
				 
		assertThat(actualLength, closeTo(expectedLength,0.01));
	}

	
	@Test
	public void whenGiveMaxsideObjectWrongTriangleShouldGetZeroLength() throws Exception {
		//Create&initialize
		Triangle wrongTriangle = new Triangle(new Point(0.0,0.0), new Point(0.0,15.0), new Point(0.0,0.0));
		double expectedLength = 0.0;
		Longestside longestSide = new Longestside();
		
		double actualLength = longestSide.max(wrongTriangle);
				
		assertThat(actualLength, closeTo(expectedLength,0.01));
	}
}
