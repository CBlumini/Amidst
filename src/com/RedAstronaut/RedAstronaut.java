package com.RedAstronaut;
import com.Impostor.Impostor;
import com.Player.Player;

import java.util.Arrays;

public class RedAstronaut extends Player implements Impostor
{

    // instance variable
    private String skill;
    public static final int DEFAULT_SUS_LEVEL = 15;
    public static final String DEFAULT_SKILL = "experienced";

    //Main Constructor
    public RedAstronaut(String name, int susLevel, String skill){
        super(name, susLevel);
        this.skill = skill;
    }

    //default constructor
    public RedAstronaut(String potato){
        super(potato, DEFAULT_SUS_LEVEL);
        this.skill = DEFAULT_SKILL;
    }

    //*****************Methods***************

    //String test;

    /**need to check the player is frozen and keep them from even calling this? How? Bad problem statemet?
     * Using an if statement seems to prevent compile since method is not decalred
    */
    //need to sort the players array and then select the highest suslevel
    //set the voted off play to frozen using the frozen setter
    @Override
    public void emergencyMeeting () {
        if (!isFrozen()){
            Player[] tempArr = getPlayers();
            Arrays.sort(tempArr);
            //Player tempPlayer1 = tempArr[tempArr.length - 1];
            //Player tempPlayer2 = tempArr[tempArr.length - 2];
            if (!tempArr[tempArr.length - 1].equals(tempArr[tempArr.length - 2])) {
                tempArr[tempArr.length - 1].setFrozen(true);
            }
        }
        gameOver();
    }


    @Override
    public void freeze(Player p) {

    }

    @Override
    public void sabotage(Player p) {

    }





}
