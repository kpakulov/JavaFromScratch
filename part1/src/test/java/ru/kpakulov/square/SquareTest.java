package ru.kpakulov.square;


import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


/**
 * Testing Quadratic class
 *
 * @author Konstantin Pakulov
 * @version 11/9/2016
 */


//@Ignore

public class SquareTest {

    @Test
    public void whenSettingABCThenQuadraticExpected() throws Exception {
        Square quadra = new Square(1,2,3);
        double quadraResult = quadra.quadraEq(4);
        assertThat(quadraResult, is(27.0));
    }
    
    @Test
    public void whenMainIsPrintingThenCatchOutput() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        
        Square quadra = new Square(1,2,3);
        String arrgs[] = {"6", "7", "1"};
        quadra.show(arrgs);
        assertThat(out.toString(), is("51.0\n66.0\n"));
    }
}