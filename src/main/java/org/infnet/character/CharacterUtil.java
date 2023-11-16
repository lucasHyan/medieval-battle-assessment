package org.infnet.character;

import java.util.Random;

public class CharacterUtil {
    public static Character createUserHero(String heroClass) {
        return switch (heroClass){
            case "Warrior" -> new Warrior();
            case "Barbarian" -> new Barbarian();
            case "Paladin" -> new Paladin();
            default -> throw new RuntimeException("Class " + heroClass + " was not found");

        };
    }
    public static Character createMonster() {
        Random random = new Random();
        int randomGeneratedMonster;
        randomGeneratedMonster = random.nextInt(3) + 1;

        return switch(randomGeneratedMonster){
            case 1 -> new Kobold();
            case 2 -> new Undead();
            case 3 -> new Orc();
            default -> throw new IllegalStateException("Unexpected value: " + randomGeneratedMonster);
        };

    }
}
