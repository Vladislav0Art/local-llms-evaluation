package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void estimate_EmptyYearRange_ReturnsNaN() {
        assertEquals(Double.NaN, DeltaT.estimate(LocalDate.of(1800, 1, 1)));
    }

    @Test
    public void decimalYear_CorrectYearValue_ReturnsCorrectDecimalValue() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double result = DeltaT.decimalYear(forDate);
        assertEquals(50.25, result, 0.01);
    }

    @Test
    public void estimate_Before1900_ReturnsDeltaTValue() {
        LocalDate forDate = LocalDate.of(1875, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result > -20 && result < 120);
    }

    @Test
    public void estimate_After2150_ReturnsDeltaTValue() {
        LocalDate forDate = LocalDate.of(2250, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -20 && result <= 32 * pow(((forDate.getYear() - 1820) / 100), 2));
    }

    @Test
    public void estimate_EmptyMonthValue_ReturnsCorrectDeltaTValue() {
        LocalDate forDate = LocalDate.of(2000, 1, 15);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -20 && result <= 120);
    }

    @Test
    public void decimalYear_MonthValueNotZero_ReturnsCorrectDecimalValue() {
        LocalDate forDate = LocalDate.of(2016, 11, 1);
        double result = DeltaT.decimalYear(forDate);
        assertEquals(50.25, result, 0.01);
    }

    @Test
    public void testEstimateWithMocking() throws Exception {
        long mockYears[] = {1995};
        for (int i = 0; i < mockYears.length; i++) {
            LocalDate date = LocalDate.of(mockYears[i], 1, 1);
            double result = DeltaT.estimate(date);
            System.out.println(" mockYears[" + i + "]=" + result);

        }
    }

}