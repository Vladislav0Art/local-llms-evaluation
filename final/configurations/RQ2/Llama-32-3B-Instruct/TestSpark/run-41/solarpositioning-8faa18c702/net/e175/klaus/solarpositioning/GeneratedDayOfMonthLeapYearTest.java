package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedDayOfMonthLeapYearTest {

    @Test
    public void dayOfMonthLeapYearTest() {
        LocalDate date = DateUtils.dayOfMonth(2024, 2);
        assertEquals(29, date.getDayOfMonth());
    }

}