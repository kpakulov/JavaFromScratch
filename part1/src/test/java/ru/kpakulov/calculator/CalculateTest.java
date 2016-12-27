package ru.kpakulov.calculator;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *A mandatory comment.
 * @author Kpakulov
 * @version as of 12/26/2016
 */
 public class CalculateTest {

	/**
 	 *A mandatory comment.
 	 *
 	 *
 	 */
 	@Test
 	public void whenRunningHWThenPrintToOut() {
 		ByteArrayOutputStream out = new ByteArrayOutputStream();
 		System.setOut(new PrintStream(out));
 		Calculate.main(null);
 		assertThat(out.toString(), is("Hello World!" + System.getProperty("line.separator")));
 	}
 }
