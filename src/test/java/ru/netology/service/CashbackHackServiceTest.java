package ru.netology.service;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    @Test
   public void calculateBoundaryIfLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual= service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
    @Test
    public void calculateBoundaryIfMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual= service.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }
    @Test
    public void calculateBoundaryIfEquals1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual= service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

}
