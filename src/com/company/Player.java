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
    public void playCard(ArrayList<Player> players) {
            Player firstPlayer = players.get(0);
            if (firstPlayer.equals(this)){
                int index = rnd.nextInt(hand.getHand().size());
                playCard = hand.getHand().get(index);
                setPlayCard(playCard);
                hand.getHand().remove(index);
            } else{
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
