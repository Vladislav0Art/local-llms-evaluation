package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedDecimalYearTest {

    private static final double DELTA = 1e-15;

    @Test
    public void decimalYearTest() {
        LocalDate forDate = LocalDate.of(2005, 6, 1);
        double result = DeltaT.decimalYear(forDate);
        double expected = 2005.4583333333333;
        assertEquals(expected, result, DELTA);
    }

}