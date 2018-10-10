package Main;

import pkgEnum.*;

public class Card {
	
	private Suit Suit;
	private Rank Rank;
	
	public Card(pkgEnum.Suit Suit, pkgEnum.Rank Rank)
	{
		super();
		this.Suit = Suit;
		this.Rank = Rank;
	}
	
	public Suit getSuit()
	{
		return Suit;
	}
	
	public Rank getRank()
	{
		return Rank;
	}

}
