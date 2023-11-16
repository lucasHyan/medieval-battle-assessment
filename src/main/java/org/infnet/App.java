package org.infnet;

import java.util.Scanner;

import  org.infnet.MainMenu;
import org.infnet.character.Character;
import org.infnet.character.CharacterUtil;


public class App {
    public static void main(String[] args) {
        MainMenu mainmenu = new MainMenu();

        mainmenu.welcomeMenu();
        Scanner scanner = new Scanner(System.in);
        String userNicknameChoice = scanner.next();

        mainmenu.classChoiceMenu();
        String userClassChoice = scanner.next();

        String userClass;
        switch (userClassChoice) {
            case "2" -> userClass = "Barbarian";
            case "3" -> userClass = "Paladin";
            default -> userClass = "Warrior";

        }

        Character playerCharacter = CharacterUtil.createUserHero(userClass);
        Character generatedMonster = CharacterUtil.createMonster();

        Battle battle = new Battle(playerCharacter, generatedMonster);

        battle.startBattle();
    }
}

