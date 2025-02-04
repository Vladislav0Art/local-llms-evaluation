package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedDecimalYearForDateIn20thCenturyTest {

    @Test
    public void decimalYearForDateIn20thCenturyTest() {
        LocalDate date = LocalDate.of(2025, 1, 1);
        double estimatedDecimalYear = DeltaT.decimalYear(date);
        assertEquals(206.58333333, estimatedDecimalYear, 0.01);
    }
}

}