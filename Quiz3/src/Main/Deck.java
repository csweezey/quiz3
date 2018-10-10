package Main;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> deckCards = new ArrayList<Card>(1);
	
	public Deck(){
		for (Suit Suit : Suit.values()){
			for (Rank Rank : Rank.values()){
				deckCards.add(new Card(Suit, Rank));
			}
		}
		Collections.shuffle(deckCards);
	}
	
	public Card Draw() {
		return deckCards.remove(0);		
	}
	
	public int DeckSize() {
		return deckCards.size();
	}
	
	public int getRemaining(Object Enum) {
		oneCard = 0;
		
		for (Card c : deckCards) {
			if ((c.getSuit() == Suit)|| (c.getRank() == Rank)) {
				deckCards.add(oneCard);
				return oneCard;
			}
		}
	}

}
