/**
 *Date: Feb 3, 2021
 *Title: ICE1
 *@author Robert Gonzales
 *@version
 *
 *
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        boolean result = false;//For the result
        Random rand = new Random();//initializes Random util
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;//Sets the magicians hand to a variable
        }

        Card userInput = new Card();
        
        System.out.println("\nEnter the value your card");//Asks the user to input the value of there card
        int val = input.nextInt();//Declares the input as an int variable named val
        
        System.out.println("Enter the suit of the card: " + Arrays.toString(Card.SUITS));//Asks the user to input the suit of there card and displays the array
        String suit = input.next();
        
        userInput.setValue(val);//Sets the users input in setValue method
        userInput.setSuit(suit);//Sets the users input in setSuit method
        
        System.out.println("Searching for: " + userInput);
    
        //To determine if the users card is in the magicians hand
        for (int i = 0; i < magicHand.length; i++) //The loops is the length to the array
        {
            
            if ((magicHand[i].getValue() == userInput.getValue()) && magicHand[i].getSuit().equalsIgnoreCase(userInput.getSuit())) 
            {
                System.out.println("Card is found in the magicians hand");//Tells the user the carder is found in the magicians hand
                result = true;
                break;//Break is incluced so the result does not loop to the arrays length (7 times)
            }
            else//If the userInput does not equal the the magicians hand
            {
                System.out.println("Card is not found in the magicians hand.");//Tells the user the card is not in the magicians hand
                break;//Break is incluced so the result does not loop to the arrays length (7 times)
            }
        }
            
    }
   
}