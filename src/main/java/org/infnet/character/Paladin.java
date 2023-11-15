package org.infnet.character;

import org.infnet.Dice;

public class Paladin extends Character{
    public Paladin() {
        super(15,2,5,1);
    }
    @Override
    public int getDamage(){
        Dice dice = new Dice();
        return dice.rollD4() + dice.rollD4();
    }
}
