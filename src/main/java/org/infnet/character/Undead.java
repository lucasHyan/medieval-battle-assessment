package org.infnet.character;

import org.infnet.Dice;

public class Undead extends Character{
    public Undead() {
        super(25,4,0,1);
    }
    @Override
    public int getDamage(){
        return Dice.rollD4() + Dice.rollD4() + getStrength();
    }
}
