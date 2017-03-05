package edu.oregonstate.cs361.battleship;

import java.util.ArrayList;

public class CivShip extends Ship{


    public void autoSink(ArrayList<Coordinate> hitsList){
        // Function that fires at all the ship coords, sinking it. Called when any coord of civship gets hit

        Coordinate currCoor = this.start;
        int row = currCoor.getDown();
        int col = currCoor.getAcross();
        
        if (this.start.getDown() == this.end.getDown()) {
            // if the start and end coordinates of this ship lie on the same row, iterate over coordinates horizontally
            for (int i = 0; i < this.length; i++) {
                hitsList.add(currCoor);
                col = currCoor.getAcross() + 1;
                currCoor = new Coordinate(col, row);
            }
        } else {
            // else, they lie on the same column, so iterate over ship's coordinates vertically
            for (int j = 0; j < this.length; j++) {
                hitsList.add(currCoor);
                row = currCoor.getDown() + 1;
                currCoor = new Coordinate(col, row);            // Coordinate constructor: Coordinate(column, row)
            }
        }

    }

    public CivShip(String name, int length, Coordinate start, Coordinate end) {
        this.name = name;
        this.length = length;
        this.start = start;
        this.end = end;
        this.hasStealth = false;
        this.hasArmor = false;
    }


}
