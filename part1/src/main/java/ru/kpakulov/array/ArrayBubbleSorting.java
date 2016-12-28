package ru.kpakulov.array;

/**
 * A class for sorting an array using the bubble sorting algorithm.
 *@author Konstantin Pakulov
 *@version as of 12/18/2016
 */
 public class ArrayBubbleSorting {
	 /**
	  *The array for bubble sorting.
	  */
	 private int[] values;

	 /**
	  * The array for sorting.
	  * @param values initializing array values
	  */
	 public ArrayBubbleSorting(int[] values) {
		 this.values = values;
	 }

	 /**
	  * The array for sorting.
	  * @return values previously set
	  */
	 public int[] getValues() {
		 return this.values;
	 }

	 /**
	  * Variable setter, just in case.
	  * @param values setting internal values
	  */
	 public void setValues(int[] values) {
		 this.values = values;
	 }

	 /**
	  *Sorting an array using the bubble algorithm.
	  */
	 public void sort() {
		 for (int indexOuter = this.values.length - 1; indexOuter >= 0; indexOuter--) {
			 for (int indexInner = 0; indexInner < indexOuter; indexInner++) {
				 if (this.values[indexInner] > this.values[indexInner + 1]) {
				 	int temp = this.values[indexInner];
				 	this.values[indexInner] = this.values[indexInner + 1];
				 	this.values[indexInner + 1 ] = temp;
				 }
			 }
		 }
	 }
}