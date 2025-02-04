package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateDeltaTTwoThousandSixteenTest() {
        LocalDate forDate = LocalDate.of(2016, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -2400 && result <= 700);
    }

    @Test
    public void estimateDeltaTFourThousandFourteenTest() {
        LocalDate forDate = LocalDate.of(2014, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -2400 && result <= 700);
    }

    @Test
    public void estimateDeltaTSolarEclipseTest() {
        LocalDate forDate = LocalDate.of(2012, 5, 20);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -2400 && result <= 700);
    }

    @Test
    public void estimateDeltaTPastYearsTest() {
        LocalDate forDate = LocalDate.of(1901, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -2400 && result <= 700);
    }

    @Test
    public void testNonNegativeResultForPositiveYearTest() {
        LocalDate forDate = LocalDate.of(2001, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result > 0);
    }

    @Test
    public void estimateDeltaTSimpleCasesTest() {
        int[][] years = {{-1000}, {1500}, {1800}};
        for (int[] y : years) {
            LocalDate forDate = LocalDate.of(y[0], 1, 1);
            double result = DeltaT.estimate(forDate);
            assertEquals(result, calculateExpectedDeltaT(y[0]), 0.01);
        }
    }

    private static double calculateExpectedDeltaT(int year) {
        switch (year) {
            case -1000:
                return -20 + 32 * pow(1.5, 2);
            case 1500:
                return 10583.6 - 1014.41 * 15 + 33.78311 * pow(15, 2)
                        - 5.952053 * pow(15, 3) - 0.1798452 * pow(15, 4)
                        + 0.022174192 * pow(15, 5) + 0.0090316521 * pow(15, 6);
            case 1800:
                return -20 + 32 * pow((18.0 / 100), 2);
        }
        throw new AssertionError();
    }
}

public class DeltaT {

    public static double estimate(LocalDate forDate) {
        // ... implementation ...
    }

    private static double decimalYear(LocalDate forDate) {
        return forDate.getYear() + (forDate.getMonthValue() - 0.5) / 12;
    }

}