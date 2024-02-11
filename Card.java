/*	1. Create the following classes:
		a. Card
			i. Fields
				1. value (contains a value from 2-14 representing cards 2-Ace)
				2. name (e.g. Ace of Diamonds, or Two of Hearts)
		    ii. Methods
		     	1. Getters and Setters
		     	2. describe (prints out information about a card)
*/

package week6;

public class Card {

	int value;
	String name;
	/* Class Card created with two fields an int 'value' and a String 'name' */

	// constructor
	public Card(int value, String name) {
		setValue(value);
		setName(name);
	}
	/*
	 * the constructor makes a validation to accept numbers from 2 to 14 for the
	 * 'value' and the specific card suits for the 'name'
	 */

	// Public methods
	public void describe() {
		StringBuilder cardName = new StringBuilder();
		switch (value) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			cardName.append(Integer.toString(value));
			break;
		case 11:
			cardName.append("Jack");
			break;
		case 12:
			cardName.append("Queen");
			break;
		case 13:
			cardName.append("King");
			break;
		case 14:
			cardName.append("Ace");
			break;
		}
		cardName.append(" of " + name);
		System.out.println(cardName);
	}
	/*
	 * the describe method takes the int 'value' and converts it to string for all
	 * cards from 2 to 10. for the figure cards, it assigns a specific name
	 * following the standard playing cards names. finally, it concatenates the suit
	 * name and prints out the whole card name like the example in the instructions
	 */

	// Getters & Setters
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value >= 2 && value <= 14)
			this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == "Spades" || name == "Hearts" || name == "Diamonds" || name == "Clubs") {
			this.name = name;
		}
	}
	/*
	 * getters and setters created and again the int and String validations for the
	 * 'value' and the 'name' in the setters
	 */
}
