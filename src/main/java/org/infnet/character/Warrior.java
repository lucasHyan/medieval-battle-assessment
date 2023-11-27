package org.infnet.character;

import org.infnet.Dice;

public class Warrior extends Character{
    public Warrior() {
        super(12,4,3,3, "Warrior");
    }
    @Override
    public int getDamage(){
        return Dice.rollD4() + Dice.rollD4() + getStrength();
    }
}
