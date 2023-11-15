package org.infnet.character;

import org.infnet.Dice;

public class Warrior extends Character{
    public Warrior() {
        super(12,4,3,3);
    }
    @Override
    public int getDamage(){
        Dice dice = new Dice();
        return dice.rollD4() + dice.rollD4();
    }
}
