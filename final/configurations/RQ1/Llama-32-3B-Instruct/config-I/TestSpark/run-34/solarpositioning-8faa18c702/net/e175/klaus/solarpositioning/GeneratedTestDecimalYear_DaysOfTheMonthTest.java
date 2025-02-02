package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GeneratedTestDecimalYear_DaysOfTheMonthTest {

    public static double estimate(LocalDate forDate) {
        // implementation of the estimate method
        return 8.83;
    }

    public static double decimalYear(LocalDate forDate) {
        // implementation of the decimalYear method
        return 31;
    }
}

public class GeneratedTest {

    @Test
    public void testDecimalYear_DaysOfTheMonthTest() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double daysOfTheMonth = DeltaT.decimalYear(forDate);
        assertEquals(31, daysOfTheMonth, 0.01);
    }

}