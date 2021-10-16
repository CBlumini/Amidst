package com.BlueAstronaut;

import com.Crewmate.Crewmate;
import com.Player.Player;

public class BlueAstronaut extends Player implements Crewmate {


    /**
     * Constructor for BlueAstronaut
     */
    public BlueAstronaut(String name, int susLevel) {
        super(name, susLevel);
    }

    @Override
    public void completeTask() {

    }

    @Override
    public void emergencyMeeting() {

    }
}
