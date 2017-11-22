package com.company;

import java.util.*;


public class Player {
    String name;
    Hand hand = new Hand();
    private Card playCard;
    Random rnd = new Random();

    Player(String name){
        this.name = name;
    }
    // play card or set the play card
    public void playCard(ArrayList<Player> players) {
            Player firstPlayer = players.get(0);

            // if first player then pick a random number
            if (firstPlayer.equals(this)){
                int index = rnd.nextInt(hand.getHand().size());
                playCard = hand.getHand().get(index);
                setPlayCard(playCard);
                hand.getHand().remove(index);
            }
            // if not then pick a card related to the winner
            else{
                Card playCard = this.hand.maxCardSameSuit(firstPlayer.getPlayCard());
                setPlayCard(playCard);
                hand.getHand().remove(playCard);
            }
    }

    public Card getPlayCard() {
        return playCard;
    }

    public void setPlayCard(Card playCard) {
        this.playCard = playCard;
    }
}
