package katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CardGameTest {

	@Test
	void testCardGame() {
		assertEquals(8, CardGame.cardGame(10));
		assertEquals(3, CardGame.cardGame(4));
		assertEquals(2, CardGame.cardGame(5));
		assertEquals(9, CardGame.cardGame(12));
	}	
}
