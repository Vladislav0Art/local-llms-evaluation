package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GeneratedTest {

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
    public void testEstimate_DeltaTCloseTo1800Test() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(8.83, estimatedDeltaT, 0.01);
    }

    @Test
    public void testEstimate_DeltaTCloseTo2005Test() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(63.86, estimatedDeltaT, 0.01);
    }

    @Test
    public void testEstimate_DeltaTLargeValueForYearBefore1900Test() {
        LocalDate forDate = LocalDate.of(-500, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(10583.6, estimatedDeltaT, 0.01);
    }

    @Test
    public void testEstimate_DeltaTFarInFutureTest() {
        LocalDate forDate = LocalDate.of(2150, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(-20, estimatedDeltaT, 0.01);
    }

    @Test
    public void testDecimalYear_DaysOfTheMonthTest() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double daysOfTheMonth = DeltaT.decimalYear(forDate);
        assertEquals(31, daysOfTheMonth, 0.01);
    }

    @Test
    public void testDecimalYear_DaysInFebruaryTest() {
        LocalDate forDate = LocalDate.of(1800, 2, 29);
        double daysOfTheMonth = DeltaT.decimalYear(forDate);
        assertEquals(28, daysOfTheMonth, 0.01);
    }

}