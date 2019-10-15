package org.improving.battleShip;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GameGuesser {
//    private final int Row = 8;
//    private final int Column = 8;
//    private int [][] userGuess = new int[Row][Column];
    private GameGenerator gameGenerator;
    Scanner scanner = new Scanner (System.in);
    public void getuserGuess(int x, int y) {
        System.out.println("> Type in your guess 0-8 , 0-8");
        var input = scanner.nextLine().split(",");
        if(input.length < 1 ){
            System.out.println("Invalid answer");
        }else{
            int size = input.length;
            int[] numInput = new int[size];
            for(int i =0; i< size ; i++) {
                numInput[i] = Integer.parseInt(input[i]);
            }

        }
        //what does it want?

    }




}
