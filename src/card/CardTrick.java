/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 @Mohammed Baqar Bin Sadeq 
 @991715469
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Card LuckyCard = new Card("Ace","Hearts");
        Random baqr = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(baqr.nextInt(13) + 1);
            c.setSuit(Card.SUITS[baqr.nextInt(4)]);
            magicHand[i] = c;
        }

        System.out.print("Enter card number: ");
        int cardNumber = scanner.nextInt();
        System.out.print("Enter suit: ");
        String suit = scanner.next();

        boolean isPresent = false;

        for (Card card : magicHand) {
            if (card.getValue() == cardNumber && card.getSuit().equalsIgnoreCase(suit)) {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println("The card is present in the magic hand.");
        } else {
            System.out.println("The card is not present in the magic hand.");
        }
    }
}


    
    
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
    

