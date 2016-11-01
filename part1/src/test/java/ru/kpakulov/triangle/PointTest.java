package ru.kpakulov.triangle;

/**
 * A unit test for the class Point.class
 * Testing the method distanceTo wich calculates the distance between two given points
 * 
 * @author kpakulov
 * @version 10/14/2016
 */

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.*;
import static org.junit.Assert.*;

//@Ignore

public class PointTest {

    @Test
    public void whenTwoPointsThenResultDistance() throws Exception {
       Point pointOne = new Point(12.0, 35.0);
       Point pointTwo = new Point (3.0, 66.0);
       double expectedSpan = 32.28;
       double span = pointOne.distanceTo(pointTwo);
//       System.out.print(span);
       assertThat(expectedSpan, closeTo(span, 0.01));
    }
   
}
