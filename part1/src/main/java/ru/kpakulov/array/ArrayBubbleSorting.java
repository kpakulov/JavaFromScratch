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
		 for (int indexOut = 0; indexOut < this.values.length; indexOut++) {
			 for (int indexIn = this.values.length - 1; indexIn > indexOut; indexIn--) {
				 if (this.values[indexIn - 1] > this.values[indexIn]) {
					 swap(indexIn - 1, indexIn);
				 }
			 }
		 }
	 }

	 /**
	  * Swap elements of variable values.
	  * @param indexFirst - index of first element
	  * @param indexSecond - index of second element
	  */
	  private void swap(int indexFirst, int indexSecond) {
		  int temp = this.values[indexFirst];
		  this.values[indexFirst] = this.values[indexSecond];
		  this.values[indexSecond] = temp;
	  }
}