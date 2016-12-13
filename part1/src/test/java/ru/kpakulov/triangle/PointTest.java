package ru.kpakulov.triangle;

/**
 * A unit test for the class Point.class.
 * Testing the method distanceTo wich calculates the distance between two given points
 *
 * @author kpakulov
 * @version 10/14/2016
 */

//import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

//@Ignore

	/**
	 * Mandatory javadoc.
	 */
public class PointTest {

  /**
   * Mandatory javadoc.
   */
  private final double constOne = 12.0;

  /**
   * Mandatory javadoc.
   */
  private final double constTwo = 35.0;
    /**
   * Mandatory javadoc.
   */
  private final double constThree = 3.0;
    /**
   * Mandatory javadoc.
   */
  private final double constFour = 66.0;

  /**
   * Mandatory javadoc.
   */
  private final double constResult = 32.28;

  /**
   * Deviation which is 0.01.
   */
  private final double constDevt = 0.01;
	/**
	 * Mandatory javadoc.
	 * @throws Exception something
	 */
    @Test
    public void whenTwoPointsThenResultDistance() throws Exception {
       Point pointOne = new Point(constOne, constTwo);
       Point pointTwo = new Point(constThree, constFour);
       double expectedSpan = constResult;
       double span = pointOne.distanceTo(pointTwo);
//       System.out.print(span);
       assertThat(expectedSpan, closeTo(span, constDevt));
    }
}