package org.infnet.character;

import org.infnet.Dice;

public class Barbarian extends Character {

    public Barbarian() {
        super(13,6,1,3);
    }
    @Override
    public int getDamage(){
        return Dice.rollD6() + Dice.rollD6() + getStrength();
    }
}
