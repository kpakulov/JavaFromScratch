package ru.kpakulov.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class for testing class ArrayBubbleSorting.
 * @author Konstantin Pakulov
 * @version as of 12/18/2016
 */
public class TurnTest {

	/**
     * Array element one.
     */
    private final int aeOne = 1;

    /**
     * Array element two.
     */
    private final int aeTwo = 2;

    /**
     * Array element three.
     */
    private final int aeThree = 3;

    /**
     * Array element three.
     */
    private final int aeFour = 4;
    /**
     * Mandatory javadoc.
     *
     */
	@Test
	public void whenRotatingPredefinedArrayGetmirroredArray() {
		final int[] values = {aeOne, aeTwo, aeThree};
        	final Turn arrayRotate = new Turn(values);
        	int[] checked = {aeThree, aeTwo, aeOne};

        	arrayRotate.back();

            final int[] result = arrayRotate.getValues();
        	assertThat(result, is(checked));
	}
}