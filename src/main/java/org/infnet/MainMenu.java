package org.infnet;

import lombok.Data;
@Data

public class MainMenu {
    public void welcomeMenu() {
        System.out.println("Welcome to Medieval Battle!!");
        System.out.println("===================================");
    }
    public void classChoiceMenu(){
        System.out.println("===================================");
        System.out.println("Choose your class:");
        System.out.println("1 - Warrior");
        System.out.println("2 - Barbarian");
        System.out.println("3 - Paladin");
    }


}
