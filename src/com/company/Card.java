package com.company;

public class Card {
    // value and suit of the card
    private int value;
    private String suit;

    public Card(int val, String suit){
        this.suit = suit;
        this.value = val;
    }
    public String toString(){
        // ace cards are represented as a value 11
        if(value == 11){
            return "Ace of " + suit;
        }
        else {
            return value + " of " + suit;
        }
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
    // compare card suit
    // return true if the cards have the same suit
    public Boolean compareCardSuit(Card card){
        Boolean sameSuit;
        if(card.suit == this.suit){
            sameSuit = true;
        }else{
            sameSuit = false;
        }
        return sameSuit;
    }
}
