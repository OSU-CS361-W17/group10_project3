package edu.oregonstate.cs361.battleship;

import java.util.ArrayList;

public class CivShip extends Ship{


    public void autoSink(Coordinate test){
        // Function that fires at all the ship coords, sinking it. Called when any coord of civship gets hit

        // Returns all of the coordinates this civilian ship occupies
        if (this.covers(test) && !this.hasArmor) {
            ArrayList<Coordinate> al = new ArrayList<Coordinate>();
            // for this.length, iterate over all coordinates in this civilian ship from start to end inclusive,
            // and return an ArrayList<Coordinate> that fireAt can iterate over
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
