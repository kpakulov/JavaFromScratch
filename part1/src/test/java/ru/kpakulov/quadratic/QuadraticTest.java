package ru.kpakulov.quadratic;

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
 * @version 11/7/2016
 */

//@Ignore

public class QuadraticTest {

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
     * Mandatory comment.
     * @throws Exception something
     */
    @Test
    public void whenSettingABCThenQuadraticExpected() throws Exception {
        Quadratic quadra = new Quadratic(constOne, constTwo, constThree);
        double quadraResult = quadra.quadraEq(constFour);
        assertThat(quadraResult, is(constResult));
    }

    /**
     * Mandatory comment.
     * @throws Exception something
     */
    @Test
    public void whenMainIsPrintingThenCatchOutput() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] arrgs = {"1", "2", "3", "6", "7", "1"};
        Quadratic.main(arrgs);
        assertThat(out.toString(), is("51.0\n66.0\n"));
    }
}