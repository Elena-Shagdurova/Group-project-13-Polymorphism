package com.devxschool;

//And there is a Tortoise class:
//        *  - 'printSpeedAndGroup': print SUPER FAST if more than 1, FAST if more than 0.6, MEDIUM if more than 0.3, and SLOW if less or equal to 0.3.
//        *     After, assign moveType to crawl
// TODO SETUP THE CLASS
public class Tortoise extends AnimalData {
    public void printSpeedAndGroup(double avgSpeed) {
        if (avgSpeed > 0) {
            String group = "";
            if (avgSpeed > 1) {
                System.out.println("Average speed is: " + avgSpeed);
                group = "SUPER FAST";
            } else if (avgSpeed > 0.6) {
                System.out.println("Average speed is: " + avgSpeed);
                group = "FAST";
            } else if (avgSpeed > 0.3) {
                System.out.println("Average speed is: " + avgSpeed);
                group = "MEDIUM";
            } else {
                System.out.println("Average speed is: " + avgSpeed);
                group = "SLOW";
            }
            setMoveType("crawl");
            System.out.println("Animal group is: " + group);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}



