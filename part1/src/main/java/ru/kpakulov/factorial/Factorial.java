package ru.kpakulov.factorial;
/**
 * A tiny class Factorial calculating a factorial of a given digitnumber.
 *
 * @author Konstantin Pakulov
 * @version 11/4/2016
 */

public class Factorial {
	/**
	 * hahaha.
	 * @param x pam pam.
	 * @return result something.
	 */
	public int factorial(int x) {
		/**
		 * hahaha.
		 */
		int result = 1;
		for (int i = 2; i <= x; i++) {
			result *= i;
		}
		return result;
	}
}