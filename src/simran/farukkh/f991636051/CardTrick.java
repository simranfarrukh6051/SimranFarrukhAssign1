/**
 * Assignment 1 - GitHub Set + Java Code Basics
 * @author Simran 
 * @version 1.0 
 * @date 6/5/2021
*/

package simran.farukkh.f991636051;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Simran
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(c.randomValue());
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i] = c;
        }
     
        System.out.println("Pick a card! Any card! ");
        System.out.println("Pick the value for your card");

        String pickedCard = input.nextLine();
        System.out.println("Please type the name of your suit");
        
        int pickedValue = input.nextInt();
        
        System.out.println("Your card is: " + pickedValue + " of " 
                + pickedCard);
        
        System.out.println("Do you think your card is the magic card? "
                + "Let's find out!");
      
        /**
        Card magicHandNew = new Card();
        
        if(pickedValue == magicHandNew.getValue() && 
                pickedCard.equals(magicHandNew.getSuit())){
            System.out.println("You did it!");
        }
        else{
            System.out.println("Oooop! Try again~");
        }
        
        */
        
        Card luckyCard = new Card(1, "Hearts");
                
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
