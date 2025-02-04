package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedDecimalYearForDateIn1800sWithNegativeMonthTest {

    @Test
    public void decimalYearForDateIn1800sWithNegativeMonthTest() {
        LocalDate date = LocalDate.of(-12, 1, 1);
        double estimatedDecimalYear = DeltaT.decimalYear(date);
        assertEquals(187.5, estimatedDecimalYear, 0.01);
    }

}