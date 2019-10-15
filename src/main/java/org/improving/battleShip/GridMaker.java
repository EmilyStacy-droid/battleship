package org.improving.battleShip;

import javax.swing.*;

public class GridMaker {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5, 6, 7, 8 }, {1, 2, 3, 4, 5, 6, 7, 8 }, {1, 2, 3, 4, 5, 6, 7, 8 } };

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                    System.out.print(arr[i][j]+ " ");

            }

            System.out.println();
        }
    }
}
