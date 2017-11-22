package com.company;

import java.util.*;
public class Hand {
    private ArrayList<Card> hand;
    Random rnd = new Random();
    // constructor
    Hand(){
        hand = new ArrayList<>();
    }
    public ArrayList<Card> getHand() {
        return this.hand;
    }
    public Card getCard(Card c){
         return hand.get(hand.indexOf(c));
    }
    // return maximum card in hand that has the same suit as the winner's play card
    public Card maxCardSameSuit(Card poolCard){
        Card rtrn;
        ArrayList<Card> cards = new ArrayList<Card>();
        for(Card c : hand){
            if(c.compareCardSuit(poolCard)){
                cards.add(c);
            }
        }
        if(cards.isEmpty()){
            int index = rnd.nextInt(hand.size());
            rtrn = hand.get(index);
        }else{
        rtrn = maxCard(cards);}
        return rtrn;
    }
    // return max card unbias of suit
    public Card maxCard(ArrayList<Card> cards){
        Card maxCard = cards.get(0);
        for(Card c : cards){
            if(maxCard.getValue() < c.getValue()){
                maxCard = c;
            }
        }
        return maxCard;
    }
}
