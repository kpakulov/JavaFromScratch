package ru.kpakulov.square;

import org.apache.commons.io.output.ByteArrayOutputStream;
//import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Testing Quadratic class.
 *
 * @author Konstantin Pakulov
 * @version 11/9/2016
 */

//@Ignore

public class SquareTest {

    /**
     * Mandatory javadoc.
     */
    private final int constOne = 1;

    /**
     * Mandatory javadoc.
     */
    private final int constTwo = 2;

    /**
     * Mandatory javadoc.
     */
    private final int constThree = 3;

    /**
     * Mandatory javadoc.
     */
    private final int constFour = 4;

    /**
     * Mandatory javadoc.
     */
    private final double constResult = 27.0;

    /**
     * Mandatory javadoc.
     * @throws Exception something
     */
    @Test
    public void whenSettingABCThenQuadraticExpected() throws Exception {
        Square quadra = new Square(constOne, constTwo, constThree);
        double quadraResult = quadra.quadraEq(constFour);
        assertThat(quadraResult, is(constResult));
    }

    /**
     * Mandatory javadoc.
     * @throws Exception something
     */
    @Test
    public void whenMainIsPrintingThenCatchOutput() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Square quadra = new Square(constOne, constTwo, constThree);
        String[] arrgs = {"6", "7", "1"};
        quadra.show(arrgs);
        assertThat(out.toString(), is("51.0\n66.0\n"));
    }
}