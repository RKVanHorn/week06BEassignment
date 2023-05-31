package week06finalproject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<>();
	int score;
	String name;
	
	Player(String name, int score, List<Card> hand){
		this.name = name;
		this.score = score;
		this.hand = hand;
	}
	
	public void describe() {
		System.out.println("-------");
		System.out.println(name);
		System.out.println("-------");
		for (Card card: hand) {
			card.describe();
		}
	}
	
	public List<Card> draw(Deck deck){
		hand.add(deck.draw());
		return hand;
	}
	
	public Card flip(List<Card> hand) {
		Card flippedCard = hand.remove(0);
		return flippedCard;
	}
	
	public int incrementScore() {
		score += 1;
		return score;
	}
	
}

