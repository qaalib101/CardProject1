package com.company;

import java.util.*;


public class Player {
    String name;
    private int position;
    Hand hand = new Hand();
    private Card playCard;
    private Boolean isWinner = false;
    Random rnd = new Random();
    ArrayList<Player> players;

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
    public Boolean getWinner() {
        return isWinner;
    }

    public void setWinner(Boolean winner) {
        isWinner = winner;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Boolean hasWinner(ArrayList<Player> players){
        Boolean winner = false;
        for(Player p : players){
            if(p.isWinner){
                winner = true;

            }
            else{
                winner = false;
                break;
            }
        }
        return winner;
    }

    public Card getPlayCard() {
        return playCard;
    }

    public void setPlayCard(Card playCard) {
        this.playCard = playCard;
    }
}
