package ru.kpakulov.calculator;

/**
* Calculator - a simple calculator class
* @author Konstantin Pakulov
* @version October 14, 2016
*/

	public class Calculator {
		private double result;

	/**
	* Adding two numbers
	* @param first double
	* @param second double
	*/

	public void add(double first, double second){
		this.result = first + second;

	}


	/** 
	* Subtracting two numbers
	* @param first double
	* @param second double
	*/
        
	public void substract(double first, double second) {
                result = first - second;
        }

	/**
	 * Multiplying two numbers
	 * @param first double
	 * @param second double
	 */
        public void multiple(double first, double second) {
                result = first * second;
        }

	/**
	 * Dividing two numbers
	 * @param first double
	 * @param second double
	 */
	public void div(double first, double second) {
        	result = first / second;
	}

	/**
	 * Return the result
	 * @return double
	 */
        public double getResult() {
                return result;
        }

}
