package org.improving.battleShip;

import java.util.*;

public class GameContext {
    private GameGenerator gameGenerator;
    private GameGuesser gameGuesser;
    private Map<List,List> shipOne = new HashMap<>();
    private Map<List,List>shipTwo = new HashMap<>();
    private Map<List,List> shipThree = new HashMap<>();
    private Map<List,List>shipFour = new HashMap<>();

    public GameContext(Map<List, List> shipOne, Map<List, List> shipTwo, Map<List, List> shipThree, Map<List, List> shipFour) {
        this.shipOne = shipOne;
        this.shipTwo = shipTwo;
        this.shipThree = shipThree;
        this.shipFour = shipFour;
    }

    public GameContext(GameGenerator gameGenerator, GameGuesser gameGuesser) {
        this.gameGenerator = gameGenerator;
        this.gameGuesser = gameGuesser;
    }


    public void setUpBoats(){
        //add occupied to each boat
    }

    public void main(String[] args) {
        System.out.println("Hello");
        //gameGuesser.getuserGuess(x,y);
        gameGenerator.initGrid();



        //shipOne.put(gameGenerator.initGrid())

        //map/grid
        //end game
    }
}
