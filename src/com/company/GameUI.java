package com.company;

import java.util.ArrayList;

import static input.InputUtils.*;

public class GameUI {
    // used to control the program
    int players;
    final static int STARTGAME = 1;
    final static int QUITGAME = 2;
    final static int PICKCARD = 3;

    GameUI(){
    }
    public void startMenu(){
        System.out.println("Start the game " + STARTGAME);
        }
    public void howManyPlayers(){
        players = intInput("How many players are playin");
    }
    public ArrayList<Player> startGame(){
        howManyPlayers();
        ArrayList<Player> list = new ArrayList<>();
        for(int x = 0; x < players; x++){
            // create new players
            Player player = new Player("Player " + (x + 1));
            player.setPosition(x + 1);
            list.add(player);
        }
        HumanPlayer user = new HumanPlayer("Me ");
        list.add(user);
        return list;
    }

}
