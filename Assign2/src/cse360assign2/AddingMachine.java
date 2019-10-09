/**
* Name: Tejasai_Kanuri 
* Class ID: Exam seat LG6
* Student ID: 1212673720
* Assignment2
*/
package cse360assign2;

public class AddingMachine {

	private int total;
	private String history = "0";
	/**
	 * The above two commands initializes an int and a string
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * The above method sets total to 0
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * The above method return the value in total
	 */
	public void add (int value) {
		total = total + value;
		toHistory('a', value);
	}
	/**
	 * The above method takes in a value and adds it to total
	 */
	public void subtract (int value) {
		total = total - value;
		toHistory('s', value);
	}
	/**
	 * The above method takes in a value and subtracts it from total
	 */
	public void toHistory (char action, int value) {
		if (action == 'a') {
			history = history.concat(" + "+value);	
		}
		if (action == 's') {
			history = history.concat(" - "+value);
		}
	}
	/**
	 * The above method saves a history of all additions and subtractions of total to the string history	
	 */
	public String toString () {
		return history;
	}
	/**
	 * The above method return the string in history
	 */
	public void clear() {
	history = "0";
	}
	/**
	 * The above method resets history to 0
	 */
}
