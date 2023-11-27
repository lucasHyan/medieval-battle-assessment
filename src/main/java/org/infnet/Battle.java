package org.infnet;

import org.infnet.character.Character;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Battle {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
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
            LOGGER.debug("Player hit points " + player.getHitPoints());
            LOGGER.debug("Monster hit points " + monster.getHitPoints());
        }while(defender.isAlive());
        LOGGER.info(attacker.getName() + " won the match!");

    }

    public boolean rollPlayerInitiative() {
        int playerInitiative;
        int monsterInitiative;
        do {
            playerInitiative = player.rollInitiative();
            monsterInitiative = monster.rollInitiative();

            LOGGER.debug("current player initiative " + playerInitiative + " current monster initiative " + monsterInitiative);
        } while (playerInitiative == monsterInitiative);
        return playerInitiative > monsterInitiative;
    }
}
