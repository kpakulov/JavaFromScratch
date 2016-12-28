package ru.kpakulov.array;

/**
 * A class for rotating an array.
 * @author Konstantin Pakulov
 * @version as of 12/27/2016
 */
public class Turn {

	 /**
	  * An array for rotating.
	  */
	 private int[] values;

	 /**
	  * An array for rotating.
	  * @param values initializing array values
	  */
	 public Turn(int[] values) {
		 this.values = values;
	 }

	 /**
	  * An array for rotating.
	  * @return values previously set
	  */
	 public int[] getValues() {
		 return this.values;
	 }

	/**
	 * Rotating the array.
	 * Note: integer division is used for index
	 */
	 public void back() {
		 for (int index = 0; index < (this.values.length / 2); index++) {
		 	int temp = this.values[index];
		 	this.values[index] = this.values[this.values.length - index - 1];
		 	this.values[this.values.length - index - 1] = temp;
		 }
	}
}
