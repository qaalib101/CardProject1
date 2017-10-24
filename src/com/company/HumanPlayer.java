package com.company;
import java.util.ArrayList;

import static input.InputUtils.*;
public class HumanPlayer extends Player{
    HumanPlayer(String name){
        super(name);
        hand = new Hand();
    }
    public void playCard(ArrayList<Player> players){
        Card setCard = players.get(0).getPlayCard();
        showHand();
        int choice;
        if(players.get(0)== this) {
            choice = intInput("Choose a card from your hand to start this round ");
        }else{
            choice = intInput("Choose a card with the same suit as " + setCard.toString());
        }
        while(choice == 0 || choice > hand.getHand().size()){
            choice = intInput("Enter a valid number");
        }
        setPlayCard(hand.getHand().get(choice - 1));
        hand.getHand().remove(hand.getHand().get(choice - 1));
    }
    public void showHand(){
        System.out.println("This is your hand ");
        int x = 1;
        for(Card c : this.hand.getHand()){
            System.out.println(x + " : " + c.toString());
            x += 1;
        }
    }
}
