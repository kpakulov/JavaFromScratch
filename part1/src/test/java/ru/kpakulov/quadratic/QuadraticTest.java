package ru.kpakulov.quadratic;


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
 * @version 11/7/2016
 */


//@Ignore

public class QuadraticTest {

    @Test
    public void whenSettingABCThenQuadraticExpected() throws Exception {
        Quadratic quadra = new Quadratic(1,2,3);
        double quadraResult = quadra.quadraEq(4);
        assertThat(quadraResult, is(27.0));
    }
    
    @Test
    public void whenMainIsPrintingThenCatchOutput() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        
        String arrgs[] = {"1","2","3", "6", "7", "1"};
        Quadratic.main(arrgs);
        assertThat(out.toString(), is("51.0\n66.0\n"));
    }
}