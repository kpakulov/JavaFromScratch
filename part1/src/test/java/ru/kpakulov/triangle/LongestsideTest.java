package ru.kpakulov.triangle;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * A unit test for the class Triangle.class.
 * Testing the method distanceTo wich calculates the distance between two given points
 *
 * @author kpakulov
 * @version 10/14/2016
 */

public class LongestsideTest {

  /**
   * Mandatory javadoc.
   */
  private final double constOne = 14.0;

  /**
   * Mandatory javadoc.
   */
  private final double constTwo = 0.0;

  /**
   * Mandatory javadoc.
   */
  private final double constThree = 8.0;

  /**
   * Mandatory javadoc.
   */
  private final double constFour = 12.7;

  /**
   * Mandatory javadoc.
   */
  private final double constFive = 36.4;

  /**
   * Mandatory javadoc.
   */
  private final double constSix = 28.0;

  /**
   * Mandatory javadoc.
   */
  private final double constSeven = 15.0;

  /**
   * Mandatory javadoc.
   */
  private final double constResult = 35.85;

  /**
   * Deviation which is 0.01.
   */
  private final double constDevt = 0.01;

  /**
	 * Mandatory javadoc.
	 * @throws Exception something
	 */
	@Test
	public void whenGiveMaxsideObjectCorrectTriangleShouldGetLengthOfMaxSideInTriangleA() throws Exception {
		//Creating the object and initializing variables
		Triangle possibleTriangle = new Triangle(new Point(constOne, constTwo), new Point(constThree, constFour), new Point(constFive, constSix));
		double expectedLength = constResult;
		Longestside longestSide = new Longestside();

		double actualLength = longestSide.max(possibleTriangle);

		assertThat(actualLength, closeTo(expectedLength, constDevt));
	}

/**
   * Mandatory javadoc.
   * @throws Exception something
   */
  @Test
  public void whenGiveMaxsideObjectCorrectTriangleShouldGetLengthOfMaxSideInTriangleB() throws Exception {
    //Creating the object and initializing variables
    Triangle possibleTriangle = new Triangle(new Point(constOne, constTwo), new Point(constThree, constFour), new Point(constFive, constSix));
    double expectedLength = constResult;
    Longestside longestSide = new Longestside();

    double actualLength = longestSide.max(possibleTriangle);

    assertThat(actualLength, closeTo(expectedLength, constDevt));
  }

	/**
	 * Mandatory javadoc.
	 * @throws Exception something
	 */
	@Test
	public void whenGiveMaxsideObjectWrongTriangleShouldGetZeroLength() throws Exception {
		//Create&initialize
		Triangle wrongTriangle = new Triangle(new Point(0.0, 0.0), new Point(0.0, constSeven), new Point(0.0, 0.0));
		double expectedLength = 0.0;
		Longestside longestSide = new Longestside();

		double actualLength = longestSide.max(wrongTriangle);

		assertThat(actualLength, closeTo(expectedLength, constDevt));
	}
}