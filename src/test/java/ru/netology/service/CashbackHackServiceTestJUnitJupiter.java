package ru.netology.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestJUnitJupiter {

    @Test
    void remainBefore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Disabled
    @Test
    void remain1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void remainAfter1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}