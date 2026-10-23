package org.firstinspires.ftc.teamcode.sandbox.alexha.training;

public class Dinosaur {

    // Variables
    int heightInFeet;
    int weightInPounds;
    static final double RUNNING_SPEED = 12.0; // in mph


    // Constructor
    public Dinosaur(int heightInFeet, int weightInPounds) {
        this.heightInFeet = heightInFeet;
        this.weightInPounds = weightInPounds;
    }

    // Methods
    public void increaseHeight(int heightChange) {
        heightInFeet = getHeight() + heightChange;
    }

    public int getHeight() {
        return heightInFeet;
    }

}
