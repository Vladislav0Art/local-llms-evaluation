package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYearFiveMillenniumCanonSolarEclipsesTest {

    @Test
    public void decimalYearFiveMillenniumCanonSolarEclipsesTest() {
        LocalDate date = LocalDate.of(1999, 12, 10);
        double year = DeltaT.decimalYear(date);
        assertEquals(date.getYear() + (date.getMonthValue() - 0.5) / 12, year, 0.01);
    }

}