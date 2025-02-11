package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedDecimalYearEarlyYearsCorrect {

    @Test
    public void decimalYearEarlyYearsCorrect() {
        LocalDate forDate = LocalDate.of(1820, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.decimalYear(forDate);
        assertEquals(1820.5, result, 0.00001);
    }

}