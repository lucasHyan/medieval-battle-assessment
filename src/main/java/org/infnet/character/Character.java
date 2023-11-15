package org.infnet.character;

import lombok.Data;
@Data
public abstract class Character {

    private int HitPoints;
    private int strength;
    private int defense;
    private int agility;

    public Character(int HitPoints,int strength,int defense,int agility){
        this.HitPoints = HitPoints;
        this.strength = strength;
        this.defense = defense;
        this.agility = agility;
    }

    public abstract int getDamage();

}
