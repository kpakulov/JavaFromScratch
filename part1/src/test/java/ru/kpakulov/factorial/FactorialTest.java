package ru.kpakulov.factorial;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


/**
 * Testing Factorial class
 *
 * @author Konstantin Pakulov
 * @version 11/4/2016
 */


//@Ignore

public class FactorialTest {

    @Test
    public void whenProvidingNumberThenFactorialExpected() throws Exception {
        Factorial factr = new Factorial();
        int factrResult = factr.factorial(7);
        assertThat(factrResult, is(5040));
    }
}