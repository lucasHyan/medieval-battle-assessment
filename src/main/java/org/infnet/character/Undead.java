package org.infnet.character;

import org.infnet.Dice;

public class Undead extends Character{
    public Undead() {
        super(25,4,0,1);
    }
    @Override
    public int getDamage(){
        Dice dice = new Dice();
        return dice.rollD4() + dice.rollD4();
    }
}
