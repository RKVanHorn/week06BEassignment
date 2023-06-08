package week06finalproject;

public class Card {
	String name; //face name
	String suit; //suit name
	int value; //value is 2-14
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	Card(String name, String suit, int value) {  //create a card that has a name, suit and value
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public void describe() {
		System.out.println(name + " of " + suit);
	}

}
