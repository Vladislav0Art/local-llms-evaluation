package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedDecimalYearForDateIn1800sTest {

    @Test
    public void decimalYearForDateIn1800sTest() {
        LocalDate date = LocalDate.of(1823, 1, 1);
        double estimatedDecimalYear = DeltaT.decimalYear(date);
        assertEquals(183.58333333, estimatedDecimalYear, 0.01);
    }

}