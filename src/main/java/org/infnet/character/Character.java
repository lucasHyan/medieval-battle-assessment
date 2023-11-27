package org.infnet.character;

import lombok.Data;
import org.infnet.Dice;

@Data
public abstract class Character {

    private String name;
    private int hitPoints;
    private int strength;
    private int defense;
    private int agility;

    public Character(int HitPoints,int strength,int defense,int agility, String name){
        this.hitPoints = HitPoints;
        this.strength = strength;
        this.defense = defense;
        this.agility = agility;
        this.name = name;
    }

    public abstract int getDamage();


    public int rollInitiative() {
        return Dice.rollD10() + agility;
    }
    public int rollAttack() {
        return Dice.rollD10() + agility + strength;
    }
    public int rollDefense() {
        return Dice.rollD10() + agility + defense;
    }
    public void attacks(Character defender) {
        int attackRoll = this.rollAttack();
        int defenseRoll = defender.rollDefense();

        if (defenseRoll > attackRoll) {
            return;
        }
        defender.takeDamage(this.getDamage());
    }
    public void takeDamage(int damage){
        this.hitPoints -= damage;
    }
    public boolean isAlive(){
        return this.hitPoints > 0;
    }
    @Override
    public String toString() {
        return getClass().getName();
    }
}

