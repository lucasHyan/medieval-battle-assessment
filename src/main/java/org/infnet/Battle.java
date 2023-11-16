package org.infnet;

import org.infnet.character.Character;

public class Battle {
    private final Character player;
    private final Character monster;

    public Battle(Character player, Character monster) {
        this.player = player;
        this.monster = monster;
    }

    public void startBattle() {
        Character attacker;
        Character defender;
        do {
            boolean playerAttacks = rollPlayerInitiative();

            if (playerAttacks) {
                attacker = player;
                defender = monster;
            } else {
                attacker = monster;
                defender = player;
            }

            attacker.attacks(defender);
        }while(defender.isAlive());
        System.out.println(attacker + " won the match!");

    }

    public boolean rollPlayerInitiative() {
        int playerInitiative;
        int monsterInitiative;
        do {
            playerInitiative = player.rollInitiative();
            monsterInitiative = monster.rollInitiative();
        } while (playerInitiative == monsterInitiative);

        return playerInitiative > monsterInitiative;
    }
}
