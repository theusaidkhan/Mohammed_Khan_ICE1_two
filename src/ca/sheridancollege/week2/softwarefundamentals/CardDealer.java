/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

////// STEP 1 COMMENTS ////////

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        
        // 3. Create an object of Card class in CardDealer.java file - Mohammed Khan (991331378)
        Card myCard = new Card("hearts", 2);
        
        
        // 5. Edit your code from GitHub to print the card suit 
        System.out.println("Suit: " + myCard.getSuit());
        System.out.println("Value: " + myCard.getValue());
    }
}
