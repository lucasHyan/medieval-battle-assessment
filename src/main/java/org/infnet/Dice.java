package org.infnet;

import java.util.Random;

public class Dice {
    private int rollDice(int sides) {
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }

    public int rollD4(){
        return rollDice(4);
    }
    public int rollD6(){
        return rollDice(6);
    }
    public int rollD8(){
        return rollDice(8);
    }
    public int rollD2(){
        return rollDice(2);
    }

}
