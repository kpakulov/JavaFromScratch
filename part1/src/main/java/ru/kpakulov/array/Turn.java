/**

    //"переворачивание" массива
    for i:=1 to N div 2 do begin
      T:=A[i]; A[i]:=A[N-i+1]; A[N-i+1]:=T;
    end;

    //вывод
    for i:=1 to N do writeln('A[',i,']=',A[i]);
*/

package ru.kpakulov.array;

/**
 * A class for sorting an array using the bubble sorting algorithm.
 *@author Konstantin Pakulov
 *@version as of 12/27/2016
 */
public class Turn {

	 /**
	  *The array for mirroring.
	  */
	 private int[] values;

	 /**
	  * The array for sorting.
	  * @param values initializing array values
	  */
	 public Turn(int[] values) {
		 this.values = values;
	 }

	 /**
	  * The array for rotating.
	  * @return values previously set
	  */
	 public int[] getValues() {
		 return this.values;
	 }

	/**
	 * Mirroring an array.
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
