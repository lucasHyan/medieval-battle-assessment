package org.infnet;

import java.util.Random;

public abstract class Dice {
    private static int rollDice(int sides) {
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }

    public static int rollD4(){
        return rollDice(4);
    }
    public static int rollD6(){
        return rollDice(6);
    }
    public static int rollD8(){
        return rollDice(8);
    }
    public static int rollD2(){
        return rollDice(2);
    }
    public static int rollD10(){
        return rollDice(10);
    }

}
