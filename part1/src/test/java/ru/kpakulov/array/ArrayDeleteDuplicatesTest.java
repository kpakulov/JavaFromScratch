package ru.kpakulov;


import org.junit.Test;

//import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

/**
 *Class for testing class ArrayDeleteDuplicates.
 *@author Konstantin Pakulov
 *@version as of 12/19/2016
 */

 public class ArrayDeleteDuplicatesTest {

   /**
  	 * Mandatory javadoc.
   	 *
   	 */
    @Test
    public void whenDeleteDuplicates() {
        /**
     	 * Mandatory javadoc.
     	 *
     	 */
        final String[] values = {"string1", "string2", "string3", "string1", "string4", "string2"};

        /**
     	 * Mandatory javadoc.
     	 *
     	 */
        final ArrayDeleteDuplicates arrayDeleteDuplicates = new ArrayDeleteDuplicates(values);
        /**
     	 * Mandatory javadoc.
     	 *
     	 */
        final String[] checked = {"string1", "string2", "string3", "string4"};

        arrayDeleteDuplicates.deleteDublicate();
        final String[] result = arrayDeleteDuplicates.getArrayStrings();
        assertArrayEquals(result, checked);
    }
}