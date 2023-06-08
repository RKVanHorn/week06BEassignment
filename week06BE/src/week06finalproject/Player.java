package week06finalproject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<>();
	int score; //score will start at 0 when instantiated
	String name;
	
	Player(String name, int score, List<Card> hand){ 
		//can theoretically give a handicap to a player if you want to start the score at something other than 0
		this.name = name;
		this.score = score;
		this.hand = hand;
	}
	
	public void describe() {
		System.out.println("-------");
		System.out.println(name);
		System.out.println("-------");
		for (Card card: hand) { //go through the player's hand and use the describe method for each card in their hand
			card.describe();
		}
	}
	
	public List<Card> draw(Deck deck){//use the draw method from Deck to remove a card and add it to the players hand
		hand.add(deck.draw());
		return hand;
	}
	
	public Card flip(List<Card> hand) {//flip a card so we can compare cards for each round of the game
		Card flippedCard = hand.remove(0);
		return flippedCard;
	}
	
	public int incrementScore() { //add 1 to the players score
		score += 1;
		return score;
	}
	
}

