package com.company;

import java.util.ArrayList;
import java.lang.Exception;
public class Main {
    /*
    * Repository URL: https://github.com/qaalib101/CardProject1 */

    public static void main(String[] args) {
        GameUI gameUI = new GameUI();
        ArrayList<Player> players = gameUI.startGame();
        Dealer dealer = new Dealer(players);
        Player winner = players.get(0);

        int y = 0;
        int deckSize = dealer.cardDeck.deck.size();
        int playerHandSize = players.size() * 3;
            for (y = 0; y < 2; y++) {
                while(deckSize > playerHandSize) {
                        dealer.passCards(players);
                        for (int x = 0; x < 3; x++) {
                            for (Player p : players) {
                                p.playCard(players);
                            }
                            winner = dealer.getWinner();
                            System.out.println("  ");
                            System.out.println("Winner of this round is " + winner.name);
                            System.out.println("  ");
                            players.remove(winner);
                            players.add(0, winner);
                        }
                        deckSize -= playerHandSize;
                }
                if(playerHandSize>deckSize){
                    break;
                }
            }
        System.out.println("The winner of the game is " + winner.name);
    }
}
