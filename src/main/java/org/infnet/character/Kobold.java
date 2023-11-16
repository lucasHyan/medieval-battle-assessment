package org.infnet.character;

import org.infnet.Dice;

public class Kobold extends Character {
    public Kobold() {
        super(20,4,2,4);

    }

    @Override
    public int getDamage(){
        return Dice.rollD2() + Dice.rollD2() + Dice.rollD2() + getStrength();
    }
}
