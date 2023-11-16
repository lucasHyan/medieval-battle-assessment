package org.infnet;
import lombok.Data;
import org.infnet.character.*;
import org.infnet.character.Character;

import java.util.Scanner;
@Data

public class MainMenu {
    public void welcomeMenu() {
        System.out.println("Welcome to Medieval Battle!!");
        System.out.println("===================================");
        System.out.println("Type your name:");

        Scanner scanner = new Scanner(System.in);
        String userNicknameChoice= scanner.next();


        System.out.println("===================================");
        System.out.println("Choose your class:");
        System.out.println("1 - Warrior");
        System.out.println("2 - Barbarian");
        System.out.println("3 - Paladin");
        String userClassChoice = scanner.next();

        String userClass;
        switch (userClassChoice){
            case "2" -> userClass = "Barbarian";
            case "3" -> userClass = "Paladin";
            default ->  userClass = "Warrior";

        };
        Character playerCharacter = CharacterUtil.createUserHero(userClass);
        Character generatedMonster = CharacterUtil.createMonster();


    }


}
