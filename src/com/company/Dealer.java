package com.company;

import java.util.ArrayList;

public class Dealer{
    Deck cardDeck;
    private final String name = "Dealer";
    ArrayList<Player> players;

    Dealer(ArrayList<Player> players){
        cardDeck = new Deck();
        cardDeck.shuffleDeck();
        this.players = players;
    }
    public void passCards(ArrayList<Player> players){
        for (Player p : players) {
                // add the three cards and then delete the three cards form the deck
                p.hand.getHand().addAll(cardDeck.getFirstThreeCards());
        }
    }
    public Deck getCardDeck() {
        return cardDeck;
    }
    public Player getWinner(){
        Player winner = players.get(0);
        for(Player p : players){
            if(winner.getPlayCard().getValue() < p.getPlayCard().getValue() && winner.getPlayCard().compareCardSuit(p.getPlayCard())){
                winner = p;
            }
        }
        return winner;
    }
}
