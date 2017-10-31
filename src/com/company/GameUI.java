package com.company;

import java.util.ArrayList;

import static input.InputUtils.*;

public class GameUI {
    // used to control the program
    int players;

    GameUI(){
    }
    public void howManyPlayers(){
        players = intInput("How many players are playing with you? ");
    }
    public ArrayList<Player> startGame(){
        howManyPlayers();
        ArrayList<Player> list = new ArrayList<>();
        while(players >= 7 || players < 1){
            players = intInput("Enter a valid number of players(in between 1 and 6)");
        }
        for(int x = 0; x < players; x++){
            // create new players
            Player player = new Player("Player " + (x + 1));
            list.add(player);
        }
        HumanPlayer user = new HumanPlayer("Me ");
        list.add(user);
        return list;
    }

}
