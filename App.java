/* 	2. Create a class called App with a main method.
		a. Instantiate a Deck and two Players, call the shuffle method on the deck.
		b. Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		c. Using a traditional for loop, iterate 26 times and call the flip method for each player.
			Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.  Print a message to say which player received a point.
			Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
		d. After the loop, compare the final score from each player.
		e. Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
*/


package week6;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deck deck1 = new Deck();
		Player p1 = new Player("Juan");
		Player p2 = new Player("Pedro");
		deck1.shuffle();
//		System.out.println("deck after shuffle" + deck1.cards.size());
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) { 
				p1.draw(deck1);
			} else if (i % 2 == 1) {
				p2.draw(deck1);
			}
//			System.out.println(i);
		}
//		System.out.println("deck after draw" + deck1.cards.size());

		p1.describe();
		p2.describe();
	
		for (int i = 1; i <= 26; i++) {
			System.out.println();
			int h1 = p1.flip().value;
			int h2 = p2.flip().value;
		
			if (h2 > h1 || h1 < h2) {
				p2.incrementScore();
			} else if (h1 > h2 || h2 < h1) {
				p1.incrementScore();
			} else if (h1 == h2) {
				System.out.println("No point was awarded");
			}
			System.out.println("End of round " + i);
		}
		
		if (p1.score > p2.score) {
			System.out.println("\n" + p1.name + " wins with a total score of " + p1.score);
		} else if (p2.score > p1.score) {
			System.out.println("\n" + p2.name + " wins with a total score of " + p2.score);
		} else if (p1.score == p2.score) {
			System.out.println("\n" + "Draw " + p1.name + " got " + p1.score + " and " + p2.name + " got " + p2.score);
		}
		

	}

}
