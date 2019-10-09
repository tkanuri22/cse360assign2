package cse360assign2;

public class AddingMachine {

	private int total;
	private String history = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		toHistory('a', value);
	}
	
	public void subtract (int value) {
		total = total - value;
		toHistory('s', value);
	}
	
	public void toHistory (char action, int value) {
		if (action == 'a') {
			history = history.concat(" + "+value);	
		}
		if (action == 's') {
			history = history.concat(" - "+value);
		}
	}
		
	public String toString () {
		return history;
	}

	public void clear() {
	
	}
}
