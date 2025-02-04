package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedDecimalYearForDateIn20thCenturyWithPositiveMonthTest {

    @Test
    public void decimalYearForDateIn20thCenturyWithPositiveMonthTest() {
        LocalDate date = LocalDate.of(2026, 1, 1);
        double estimatedDecimalYear = DeltaT.decimalYear(date);
        assertEquals(207.83333333, estimatedDecimalYear, 0.01);
    }

}