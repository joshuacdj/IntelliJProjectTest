package org.example.cs102proj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GameMaster {

    private ArrayList<Player> listOfPlayers;
    private final int maximumPoints = 100;

    GameMaster(ArrayList<Player> listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }

    public ArrayList<Player> getListOfPlayers() {
        return listOfPlayers;
    }

    // Checks if game has ended by checking if
    // any player has >= maximumPoints allowed
    boolean gameEnd() {

        // Loop for all players playing
        for (Player currentPlayer : listOfPlayers) {

            // If the current player's score exceeds the maximum allowed, game will end
            if (currentPlayer.getPoints() >= maximumPoints) {
                return true;
            }
        }

        // If none of the players have the maximum score, the game does not end
        return false;
    }

    // This method returns the list of players according to the rankings
    ArrayList<Player> ranking(ArrayList<Player> listOfPlayers) {
        Comparator<Player> playerComparator = new PlayerCompare();
        Collections.sort(listOfPlayers, playerComparator);

        return listOfPlayers;
    }
}
