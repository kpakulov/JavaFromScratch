package ru.kpakulov.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class for testing class ArrayBubbleSorting.
 * @author Konstantin Pakulov
 * @version as of 12/18/2016
 */
public class ArrayBubbleSortingTest {

	/**
     * Array element one.
     */
    private final int aeOne = 9;

    /**
     * Array element two.
     */
    private final int aeTwo = 2;

    /**
     * Array element three.
     */
    private final int aeThree = 13;

    /**
     * Array element four.
     */
    private final int aeFour = 7;

	/**
     * Array element five.
     */
    private final int aeFive = 6;

    /**
     * Array element six.
     */
    private final int aeSix = 8;

    /**
     * Array elementc seven.
     */
    private final int aeSeven = 1;

    /**
     * MArray element eight.
     */
    private final int aeEight = 4;

    /**
     * Array index One.
     */
    private final int indexFirst = 1;

    /**
     * Array index Two.
     */
    private final int indexSecond = 2;

    /**
     * Mandatory javadoc.
     *
     */
	@Test
	public void whenSortingPredefinedArrayGetSortedElements() {
		final int[] values = {aeOne, aeTwo, aeThree, aeFour, aeFive, aeSix, aeSeven};
        	final ArrayBubbleSorting arrayBubble = new ArrayBubbleSorting(values);
        	int[] checked = {aeSeven, aeTwo, aeFive, aeFour, aeSix, aeOne, aeThree};

        	arrayBubble.sort();
        	final int[] result = arrayBubble.getValues();
        	assertThat(result, is(checked));
	}
}