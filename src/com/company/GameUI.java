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
        // ask for the amount of players
        howManyPlayers();
        ArrayList<Player> list = new ArrayList<>();
        // checking to make sure the amount is within the limits
        while(players >= 7 || players < 1){
            players = intInput("Enter a valid number of players(in between 1 and 6)");
        }
        for(int x = 0; x < players; x++){
            // create new players
            Player player = new Player("Player " + (x + 1));
            list.add(player);
        }
        // creating a human player subclass
        HumanPlayer user = new HumanPlayer("Me ");
        list.add(user);

        return list;
    }

}
