package ru.kpakulov.triangle;

/**
 * A unit test for the class Triangle.class
 * Testing the method Triangle.area wich calculates the area of a given triangle
 * 
 * @author kpakulov
 * @version 10/14/2016
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.*;

public class TriangleTest {

    @Test
    public void whenCreatingRightTriangleShouldGetItsArea() throws Exception {

        //Assign block
        Triangle rightTriangle = new Triangle(new Point(14.0,0.0), new Point(8.0,12.7), new Point(36.4,28.0));
        double expectedArea = 226.24;
                  
        //Act block
        double actualArea = rightTriangle.area();
        
        //Action block
        assertThat(expectedArea, closeTo(actualArea,0.01));
    }

    
    @Test
    public void whenCreatingWrongTriangleShouldGetZero() throws Exception {
        //Assign block
        Triangle wrongTriangle = new Triangle(new Point(0.0,0.0), new Point(0.0, 0.0), new Point(0.0,0.0));
        double expectedArea = 0.0;
        
        //Act block
        double actualArea = wrongTriangle.area();
        
        //Action blo    ck
        assertThat(expectedArea, closeTo(actualArea,0.01));
    }
        
}
