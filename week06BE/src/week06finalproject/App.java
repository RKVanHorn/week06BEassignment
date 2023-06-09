package week06finalproject;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		
	//Set-up and deal the cards to 2 players
		Deck deck = new Deck();
		deck.shuffle();
		List<Card> hand1 = new ArrayList<>(); //create an empty list for each player's hand
		List<Card> hand2 = new ArrayList<>();
		
		Player player1 = new Player("Player1", 0, hand1);
		Player player2 = new Player("Player2", 0, hand2);
//      System.out.println("Deck has " + deck.cards.size() + " cards.");
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
//		player1.describe();
//		player2.describe();
//      System.out.println("Deck has " + deck.cards.size() + " cards.");
	
	//Flip a card from each player's deck and compare the values. 
	//Assign a point based on who has the higher value.
		Card card1 = new Card(null, null, 0);
		Card card2 = new Card(null, null, 0);
		System.out.println("---------------------");
		for (int i = 0; i<26; i++) {
			System.out.println("Round: " + (i+1));
			card1 = player1.flip(hand1);
			System.out.println("---------------------");
			System.out.println(player1.name + " plays the" );
			card1.describe();
			System.out.println();
			card2 = player2.flip(hand2);
			System.out.println(player2.name + " plays the" );
			card2.describe();
			System.out.println();
			
			if(card1.getValue() > card2.getValue()){
				player1.incrementScore();				
				System.out.println(player1.name + " wins this round");
				System.out.println("Current score is P1: " + player1.score + " P2: " + player2.score);
				System.out.println("---------------------");
			} else if (card2.getValue() > card1.getValue()) {
				player2.incrementScore();
				System.out.println(player2.name + " wins this round");
				System.out.println("Current score is P1: " + player1.score + " P2: " + player2.score);
				System.out.println("---------------------");
			} else {
				System.out.println("This round is a draw");
				System.out.println("Current score is P1: " + player1.score + " P2: " + player2.score);
				System.out.println("---------------------");
			}
		}
		//declare a winner or a tie
		
		if (player1.score > player2.score) {
			System.out.println(player1.name + " wins! Congratulations!");
		} else if (player2.score > player1.score) {
			System.out.println(player2.name + " wins! Congratulations!");
		} else {
			System.out.println("It's a tie!");
		}
		
		
		
		
		
		
		
		
	}

}