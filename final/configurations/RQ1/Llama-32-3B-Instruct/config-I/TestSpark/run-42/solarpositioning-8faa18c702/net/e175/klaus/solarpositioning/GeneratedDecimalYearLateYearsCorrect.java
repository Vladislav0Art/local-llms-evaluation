package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedDecimalYearLateYearsCorrect {

    @Test
    public void decimalYearLateYearsCorrect() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.decimalYear(forDate);
        assertEquals(2000.5, result, 0.00001);
    }

}