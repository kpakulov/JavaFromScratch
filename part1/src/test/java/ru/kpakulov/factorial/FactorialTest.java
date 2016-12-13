package ru.kpakulov.factorial;

//import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Testing Factorial class.
 *
 * @author Konstantin Pakulov
 * @version 11/4/2016
 */

//@Ignore

/**
* Mandatory javadoc.
*/
public class FactorialTest {

    /**
     * Mandatory javadoc.
     */
    private final int constOne = 7;

    /**
     * Mandatory javadoc.
     */
    private final int constResult = 5040;
	/**
	 * Mandatory javadoc.
	 * @throws Exception something
	 */
    @Test
    public void whenProvidingNumberThenFactorialExpected() throws Exception {
        Factorial factr = new Factorial();
        int factrResult = factr.factorial(constOne);
        assertThat(factrResult, is(constResult));
    }
}