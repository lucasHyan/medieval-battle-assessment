package org.infnet.character;

import org.infnet.Dice;

public class Kobold extends Character {
    public Kobold() {
        super(20,4,2,4);

    }

    @Override
    public int getDamage(){
        Dice dice = new Dice();
        return dice.rollD2() + dice.rollD2() + dice.rollD2();
    }
}
