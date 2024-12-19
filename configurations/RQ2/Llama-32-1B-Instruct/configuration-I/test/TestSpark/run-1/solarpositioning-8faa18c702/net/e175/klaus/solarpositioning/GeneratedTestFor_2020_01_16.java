package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestFor_2020_01_16 {

    private LocalDate forTest = null;

    @BeforeEach
    public void setup() {
        forTest = new LocalDate();
    }

    @Test
    public void testFor_2020_01_16() {
        LocalDate date1 = forTest;
        forTest = new LocalDate(2020, 1, 16);
        assertEqual(-12, calculateYearDifference(date1, forTest));
        assertEquals(11, calculateMonthDifference(date1, forTest));
        assertEquals(5, calculateDayDifference(date1, forTest));

        forTest = new LocalDate(2020, 1, 15);
    }

}