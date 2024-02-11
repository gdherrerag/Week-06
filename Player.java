/*		1. Create the following classes:
  			c. Player
  				i. Fields
  					1. hand (List of Card)
  					2. score (set to 0 in the constructor)
  					3. name
				ii. Methods
					1. describe (prints out information about the player and calls the describe method for each card in the Hand List)
					2. flip (removes and returns the top card of the Hand)
					3. draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
					4. incrementScore (adds 1 to the Player’s score field)
*/


package week6;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card> ();
	int score;
	String name;

	//constructor
	public Player(String name) {
		setScore(0);
		setName(name);
	}
	

	//Getters & Setters
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//public methods
	public void describe() {
		System.out.println("Player Name: " + getName());
		System.out.println("Cards on hand:");
		for (int i = 0; i < this.hand.size(); i++) {
			this.hand.get(i).describe();	
		}		
	}
	
	public Card flip() {
		System.out.print(getName() + " shows ");
		this.hand.get(0).describe();
		return this.hand.remove(0);
	}

	public void draw(Deck deck) {
		this.hand.add(deck.draw());
	}
	
	public void incrementScore() {
		this.score++;
		System.out.println(this.name + " received 1 point.");
	}
	
	
}
