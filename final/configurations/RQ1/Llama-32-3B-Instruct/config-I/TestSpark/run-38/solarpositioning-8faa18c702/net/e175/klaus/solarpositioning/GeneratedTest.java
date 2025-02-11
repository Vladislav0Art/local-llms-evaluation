package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateDeltaT_1900IsCorrectTest() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        assertEquals(Double.valueOf(63.86), DeltaT.estimate(forDate));
    }

    @Test
    public void estimateDeltaT_2005IsCorrectTest() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        assertEquals(Double.valueOf(63.86), DeltaT.estimate(forDate));
    }

    @Test
    public void estimateDeltaT_2050IsCorrectTest() {
        LocalDate forDate = LocalDate.of(2050, 1, 1);
        assertEquals(Double.valueOf(62.92), DeltaT.estimate(forDate));
    }

    @Test
    public void estimateDeltaT_1900IsNotCorrectWhenYearIs2000Test() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        assertEquals(Double.valueOf(63.86), DeltaT.estimate(forDate));
        assertNotEquals(Double.valueOf(62.92), DeltaT.estimate(forDate));
    }

    @Test
    public void estimateDeltaT_1820IsNotCorrectWhenYearIs1860Test() {
        LocalDate forDate = LocalDate.of(1860, 1, 1);
        assertEquals(Double.valueOf(-20), DeltaT.estimate(forDate));
        assertNotEquals(Double.valueOf(63.86), DeltaT.estimate(forDate));
    }

    @Test
    public void estimateDeltaT_MultipleYearsAreCorrectTest() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        assertEquals(Double.valueOf(-20 + 32 * pow(((forDate.getYear() - 1820) / 100), 2)), DeltaT.estimate(forDate));
    }

    @Test
    public void estimateDeltaT_InvalidYearIsCorrectTest() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        assertEquals(Double.valueOf(-20 + 32 * pow(((forDate.getYear() - 1820) / 100), 2)), DeltaT.estimate(forDate));
    }

}

public class DeltaTTemporal {

    public static double estimate(final LocalDate forDate) {
        final double year = decimalYear(forDate);
        // ... same code as in the original
    }

    private static double decimalYear(LocalDate forDate) {
        return forDate.getYear() + (forDate.getMonthValue() - 0.5) / 12;
    }

}