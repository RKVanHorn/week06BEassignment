package week06finalproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"♥", "♦", "♣", "♠"};
		for(String suit : suits) { //loop through the suits
			for (String name : names) { //loop through the names
				//create a card with the name, suit and a value that is equal to the index +2 of the name
				cards.add(new Card(name, suit, (Arrays.asList(names).indexOf(name)+2))); 
				
			}
		}
	}
	
	public void describe() {
		for (Card card :cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);		
	}
	
	public Card draw(){
		Card drawnCard = cards.remove(0);		
		return drawnCard;
		
	}
}

