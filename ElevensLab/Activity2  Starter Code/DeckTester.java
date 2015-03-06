/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Spades"};
        String[] ranks = {"1", "2", "3"};
        int[] pointValues = {1, 2, 3};
        int[] pointValues2 = {2, 6, 4};
        
        Deck deck = new Deck(ranks, suits, pointValues);
        Deck deck2 = new Deck(ranks, suits, pointValues);
        Deck deck3 = new Deck(ranks, suits, pointValues2);
        
        System.out.println(deck);
        System.out.println(deck2);
        System.out.println(deck3);
        
        System.out.println("Dealt card from deck 1: " + deck.deal());
        System.out.println("Dealt card from deck 3: " +deck3.deal());
    }
}
