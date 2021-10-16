package com.RedAstronaut;
import com.Impostor.Impostor;
import com.Player.Player;

import java.util.Arrays;
import java.lang.*;

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
    //need to validate that it is not the person calling the meeting
    //set the voted off play to frozen using the frozen setter
    @Override
    public void emergencyMeeting () {
        if (!isFrozen()){
            Player[] tempArr = getPlayers();
            Arrays.sort(tempArr);
            Player tempPlayer1 = tempArr[tempArr.length - 1];
            Player tempPlayer2 = tempArr[tempArr.length - 2];
            //need to set this up so it steps down if the imposter is the most sus, fine for now...
            if (tempPlayer1.compareTo(tempPlayer2) != 0) {
                /* since the array holds instances of the player class I should be able to use the getter and setter
                for each instance that I pull out of the array to retrieve data about that particular instance and change
                value for that particular instance even though I have placed the player in a temp arr. I am acting on the
                instance variable, not what is in the arr itself
                 */
                tempArr[tempArr.length - 1].setFrozen(true);
            }
        }
        gameOver();
    }

    /**Freezes the player fed into the method if they meet the correct criteria
     * 1: check if player fed in is frozen
     * 2: check if player fed in is an imposter by seeing it is implements the imposter interface
     * 3: check if the instance calling the method is less sus then the player being fed in
     * 3a: freeze if this instance is less then the suslevel fed in. Can we use compare to? How to have compareTo act on this instce
     * https://www.javatpoint.com/this-keyword
     * 3
     * @param p the player to potentially be frozen
     */
    @Override
    public void freeze(Player p) {
        if (!p.isFrozen()) {
            if (p instanceof Impostor) {
            } else {
                //Player[] tempArr = getPlayers();
                int redAstroSus = getSusLevel();
                int tempSusDelta = this.compareTo(p); //does this work?
                if (tempSusDelta <0) {
                    p.setFrozen(true);
                } else {
                    setSusLevel(redAstroSus*2);
                }
            }
        }
        gameOver();
    }

    @Override
    public void sabotage(Player p) {

    }





}
