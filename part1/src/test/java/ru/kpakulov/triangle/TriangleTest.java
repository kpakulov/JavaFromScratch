package ru.kpakulov.triangle;

/**
 * A unit test for the class Triangle.class.
 * Testing the method Triangle.area wich calculates the area of a given triangle
 *
 * @author kpakulov
 * @version 10/14/2016
 */

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Mandatory javadoc.
 */
public class TriangleTest {

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
  private final double constResult = 226.24;

  /**
   * Deviation which is 0.01.
   */
  private final double constDevt = 0.01;
    /**
     * Mandatory javadoc.
     * @throws Exception something
     */
    @Test
    public void whenCreatingRightTriangleShouldGetItsArea() throws Exception {

        //Assign block
        Triangle rightTriangle = new Triangle(new Point(constOne, constTwo), new Point(constThree, constFour), new Point(constFive, constSix));
        double expectedArea = constResult;

        //Act block
        double actualArea = rightTriangle.area();

        //Action block
        assertThat(expectedArea, closeTo(actualArea, constDevt));
    }

    /**
     * Mandatory javadoc.
     * @throws Exception something
     */
    @Test
    public void whenCreatingWrongTriangleShouldGetZero() throws Exception {
        //Assign block
        Triangle wrongTriangle = new Triangle(new Point(0.0, 0.0), new Point(0.0, 0.0), new Point(0.0, 0.0));
        double expectedArea = 0.0;

        //Act block
        double actualArea = wrongTriangle.area();

        //Action block
        assertThat(expectedArea, closeTo(actualArea, constDevt));
    }
}