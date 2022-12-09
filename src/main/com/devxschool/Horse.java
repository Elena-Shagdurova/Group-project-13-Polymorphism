package com.devxschool;
//Now configure the Horse class:
//        *  - 'printSpeedAndGroup': print SUPER FAST if more than 60, FAST if more than 40, MEDIUM if more than 20, and SLOW if less or equal to 20.
//        *     After, assign moveType to run
// TODO SETUP THE CLASS
public class Horse extends AnimalData{
    public void printSpeedAndGroup(double avgSpeed) {
        if (avgSpeed > 0) {
            String group = "";
            if (avgSpeed > 60) {
                System.out.println("Average speed is: " + avgSpeed);
                group = "SUPER FAST";
            } else if (avgSpeed > 40) {
                System.out.println("Average speed is: " + avgSpeed);
                group = "FAST";
            } else if (avgSpeed > 20) {
                System.out.println("Average speed is: " + avgSpeed);
                group = "MEDIUM";
            } else {
                System.out.println("Average speed is: " + avgSpeed);
                group = "SLOW";
            }
            setMoveType("run");
            System.out.println("Animal group is: " + group);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}





