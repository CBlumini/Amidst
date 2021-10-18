package com.BlueAstronaut;

import com.Crewmate.Crewmate;
import com.Player.Player;

public class BlueAstronaut extends Player implements Crewmate {

    private int numTasks;
    private int taskSpeed;
    public static final int DEFAULT_SUS_LEVEL = 15;
    public static final int DEFAULT_NUM_TASKS = 6;
    public static final int DEFAULT_TASK_SPEED = 10;

    /**
     * Main Constructor
     */
    public BlueAstronaut(String name, int susLevel, int numTasks, int taskSpeed) {
        super(name, susLevel);
        this.numTasks = numTasks;
        this.taskSpeed = taskSpeed;
    }

    /**
     * Defaultier constructor
     */
    public BlueAstronaut(String name) {
        super(name, DEFAULT_SUS_LEVEL);
        this.numTasks = DEFAULT_NUM_TASKS;
        this.taskSpeed = DEFAULT_TASK_SPEED;
    }
    @Override
    public void completeTask() {

    }

    @Override
    public void emergencyMeeting() {

    }
}
