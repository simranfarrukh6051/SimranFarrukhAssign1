/**
 * Assignment 1 - GitHub Set + Java Code Basics
 * @author Simran 
 * @version 1.0 
*/

package simran.farukkh.f991636051;
/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack =11, Queen =12, King = 13)
 * A .
 * @author dancysuit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in Exercise 1. When you create your own branch,
 * add your name as an author
 * @author Paul Bonenfant
 * @author Simran
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   public static final int [] VALUE = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }
    
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @param value the value to set
     */
    void setValue(int value) {
        this.value = value;
    }
   
   
    
}
