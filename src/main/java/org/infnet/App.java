package org.infnet;

import org.infnet.character.Character;
import org.infnet.character.CharacterUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        LOGGER.info("Initializing program");
        LocalDateTime start = LocalDateTime.now();
        MainMenu mainmenu = new MainMenu();


        mainmenu.welcomeMenu();
        Scanner scanner = new Scanner(System.in);
        
        LOGGER.info("Scanning user class choice");
        mainmenu.classChoiceMenu();
        String userClassChoice = scanner.next();
        LOGGER.info("Assigning user class");
        String userClass = assignUserClass(userClassChoice);
        

       
        
        LOGGER.info("Initializing player character");
        Character playerCharacter = CharacterUtil.createUserHero(userClass);
        LOGGER.info("Initializing random monster");
        Character generatedMonster = CharacterUtil.createMonster();

        LOGGER.info("Instantiating battle");
        Battle battle = new Battle(playerCharacter, generatedMonster);
        LOGGER.info("Starting battle");
        battle.startBattle();
        LocalDateTime end = LocalDateTime.now();
        long between = ChronoUnit.MILLIS.between(start, end);
        LOGGER.info("End of the program time between start to end " + between + " MS");

    }

     public static String assignUserClass(String userClassChoice) {
            String userClass;
            try {
                switch (userClassChoice) {
                    case "1" -> userClass = "Warrior";
                    case "2" -> userClass = "Barbarian";
                    case "3" -> userClass = "Paladin";
                    default -> throw new IllegalArgumentException("Invalid class choice. Please choose between 1 and 3.");
                }
            } catch (IllegalArgumentException e) {
                LOGGER.error("Invalid class choice. Please choose between 1 and 3.");
                throw e;
            }
            return userClass;
        }
}

