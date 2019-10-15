package org.improving.battleShip;

import javafx.util.Pair;
import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//8 *  8 and there are four ships (5,4,3,2) and all ships need to be hit to get them sunk
//add the ships
//map
//gamp play
//count
//end

public class GameGenerator {

    List <List [][]> shipCombination = new ArrayList<>();

    private final int Row = 8;
    private final int Column = 8;

    public int getRow() {
        return Row;
    }

    public int getColumn() {
        return Column;
    }

    public GameGenerator() {
        initGrid();
    }

    public List[][] initGrid() {
        List[][] occupied = new List [8][8];
        int count = 0;
        for (int x = 0; x < 2; x ++) {
            for(int y =0; y < 2; y++){
                count ++;
                //count to five/four/three/two times?
                //get five/four/three/two pairs?
                occupied = new List [x][y];
                System.out.println(occupied);

        }
        return occupied;
    }
     //what does it want me to return?
        shipCombination.add(occupied);
    return null;
    }

//    public void placeShip() {
//        Random r = new Random();
//
//        int o = r.nextInt(1) ;
//        //0: horizontal 1: vertical
//        if(o == 0) {
//            int x = r.nextInt(8);
//            for (int i = 0; i < 5; i++) {
//                int y = r.nextInt(3);
//            }
//        }
//
//    }
    }





