/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card = new Card("3", "Hearts", 3);
		Card card2 = new Card("King", "Diamonds", 13);
		Card card3 = new Card("3", "Hearts", 3);
		
		System.out.println(card.suit());
		System.out.println(card.rank());
		System.out.println(card.pointValue());
		
		System.out.println(card);
		
		System.out.println(card2.suit());
		System.out.println(card2.rank());
		System.out.println(card2);
		
		System.out.println(card.matches(card2));
		System.out.println(card.matches(card3));
	}
}
