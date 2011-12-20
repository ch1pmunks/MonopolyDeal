package Server;

import java.util.ArrayList;

import Message.MessageProtocol;

public class Deck {

	public static ArrayList<Byte> makeDeck() {
		
		ArrayList<Byte> deck = new ArrayList<Byte>();
		
		for(int i = 0; i < 5; i++) {
			deck.add(MessageProtocol.ONE_MONEY);
			if(i < 4) {
				deck.add(MessageProtocol.TWO_MONEY);
			}
			if(i < 2) {
				deck.add(MessageProtocol.THREE_MONEY);
				deck.add(MessageProtocol.FOUR_MONEY);
			}
			if(i < 1) {
				deck.add(MessageProtocol.FIVE_MONEY);
				deck.add(MessageProtocol.DEAL_BREAKER);
				deck.add(MessageProtocol.DOUBLE_THE_RENT);
				deck.add(MessageProtocol.HOTEL);
				deck.add(MessageProtocol.LIGHT_BLUE_BROWN_RENT);
			}
			
		}
		
		
		
		return deck;
		
	}
	
	
	
}
