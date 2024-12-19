package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestFor_2019_01_15 {

    private LocalDate forTest = null;

    @BeforeEach
    public void setup() {
        forTest = new LocalDate();
    }

    @Test
    public void testFor_2019_01_15() {
        LocalDate date1 = forTest;
        forTest = new LocalDate(2019, 1, 16);
        assertEqual(6, calculateYearDifference(date1, forTest));
        assertEquals(12, calculateMonthDifference(date1, forTest));
        assertEquals(5, calculateDayDifference(date1, forTest));

        forTest = new LocalDate(2019, 1, 15);
    }

}