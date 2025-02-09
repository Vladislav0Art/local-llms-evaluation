package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedDayOfMonthTest {

    @Test
    public void dayOfMonthTest() {
        LocalDate date = DateUtils.dayOfMonth(2022, 12);
        assertEquals(31, date.getDayOfMonth());
    }

}