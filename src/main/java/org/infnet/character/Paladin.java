package org.infnet.character;

import org.infnet.Dice;

public class Paladin extends Character{
    public Paladin() {
        super(15,2,5,1, "Paladin");
    }
    @Override
    public int getDamage(){
        return Dice.rollD4() + Dice.rollD4() + getStrength();
    }
}
