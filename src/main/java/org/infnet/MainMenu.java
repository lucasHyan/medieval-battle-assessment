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
    }
    public void classChoiceMenu(){
        System.out.println("===================================");
        System.out.println("Choose your class:");
        System.out.println("1 - Warrior");
        System.out.println("2 - Barbarian");
        System.out.println("3 - Paladin");
    }


}
