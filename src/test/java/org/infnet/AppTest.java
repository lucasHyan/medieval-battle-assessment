package org.infnet;


import static org.infnet.App.assignUserClass;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {


    @Test
    @DisplayName("TestRoll D4")
    void testRollD4() {
        int result = Dice.rollD4();
        assertTrue(result >= 1 && result <= 4);
    }

    @Test
    @DisplayName("TestRoll D6")
    void testRollD6() {
        int result = Dice.rollD6();
        assertTrue(result >= 1 && result <= 6);
    }

    @Test
    @DisplayName("TestRoll D8")
    void testRollD8() {
        int result = Dice.rollD8();
        assertTrue(result >= 1 && result <= 8);
    }

    @Test
    @DisplayName("TestRoll D2")
    void testRollD2() {
        int result = Dice.rollD2();
        assertTrue(result == 1 || result == 2);
    }

    @Test
    @DisplayName("TestRoll D10")
    void testRollD10() {
        int result = Dice.rollD10();
        assertTrue(result >= 1 && result <= 10);
    }

    @Test
    void testAssignUserClass() {
        assertThrows(IllegalArgumentException.class, () -> assignUserClass("4"));
    }
}
