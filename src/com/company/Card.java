package com.company;

public class Card {
    private int value;
    private String suit;


    public Card(int val, String suit){
        this.suit = suit;
        this.value = val;
    }
    public String toString(){
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
