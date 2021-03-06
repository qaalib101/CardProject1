package com.company;

import java.util.*;

public class Deck {
    ArrayList<Card> deck;

    Deck(){
        // create a new deck
        deck = new ArrayList<>();
        for(int x = 0; x < 1; x++){
            for(int y = 2; y < 11; y++) {
                deck.add(new Card(y, "spades"));
            }
            for(int z = 2; z < 12; z++){
                deck.add(new Card(z , "diamonds"));
            }
            for(int a = 2; a < 12; a++){
                deck.add(new Card(a , "hearts"));
            }
            for(int b = 2; b < 12; b++){
                deck.add(new Card(b , "clubs"));
            }
         }
    }
// shuffle
    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }
    // get the first three cards to pass it to the players then remove from deck
    public ArrayList<Card> getFirstThreeCards() {
        ArrayList<Card> set = new ArrayList<>();
        for(int x = 0; x < 3; x++){
            set.add(deck.get(0));
            deck.remove(0);
        }
        return set;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
}
