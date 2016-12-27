package ru.kpakulov.array;

/**
 * A class for sorting an array using the bubble sorting algorithm.
 *@author Konstantin Pakulov
 *@version as of 12/18/2016
 */
 public class ArrayBubbleSorting {
	 /**
	  *The array for sorting.
	  */
	 private int[] values;

	 /**
	  * The array for sorting.
	  * @param values pam pam
	  */
	 public ArrayBubbleSorting(int[] values) {
		 this.values = values;
	 }

	 /**
	  *The array for sorting.
	  * @return something
	  */
	 public int[] getValues() {
		 return this.values;
	 }

	 /**
	  *The array for sorting.
	  * @param values pam pam
	  */
	 public void setValues(int[] values) {
		 this.values = values;
	 }

	 /**
	  *Sorting array uzing bubble algorithm.
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