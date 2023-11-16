package org.infnet.character;

import org.infnet.Dice;

public class Orc extends Character{
    public Orc() {
        super(20,6,2,2);
    }

    @Override
    public int getDamage(){
       return Dice.rollD8() + getStrength();
    }
}
