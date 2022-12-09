package com.devxschool;


// TODO SETUP THE CLASS
public class AnimalData {
    public String name;
    public String moveType;
    public String sound;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 2) {
            this.name = name;
        }
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        if (moveType.equalsIgnoreCase("fly") || (moveType.equalsIgnoreCase("swim") || moveType.equalsIgnoreCase("run") || (moveType.equalsIgnoreCase("crawl") || (moveType.equalsIgnoreCase("jump"))))) {
            this.moveType = moveType;
        }

    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        if (sound.length() > 1) {
            this.sound = sound;
        }
    }


    public void printSpeedAndGroup(double avgSpeed) {

        if (avgSpeed > 0) {
            String group = "";
            if (avgSpeed > 30) {
                System.out.println("Average speed is: " + avgSpeed);
                group = "SUPER FAST";
            } else if (avgSpeed > 20) {
                System.out.println("Average speed is: " + avgSpeed);
                group = "FAST";
            } else if (avgSpeed > 10) {
                System.out.println("Average speed is: " + avgSpeed);
                group = "MEDIUM";
            } else {
                System.out.println("Average speed is: " + avgSpeed);
                group = "SLOW";
            }
            System.out.println("Animal group is: " + group);
        }
    }

    @Override
    public String toString() {
        return "AnimalData{" +
                "name='" + name + '\'' +
                ", moveType='" + moveType + '\'' +
                ", sound='" + sound + '\'' +
                '}' + '\n';
    }
}


//    print speed if it's not invalid (less than 0). Ex: Average speed is: 13.6
////        *       * Print group depending on speed (SUPER FAST if more than 30, FAST if more than 20,
////        *         MEDIUM if more than 10, and SLOW if less than or equal to 10). Ex: Animal group is: MEDIUM
////        *  - 'toString' method in the format: className{name='Name', moveType='MoveType', sound='sound'}