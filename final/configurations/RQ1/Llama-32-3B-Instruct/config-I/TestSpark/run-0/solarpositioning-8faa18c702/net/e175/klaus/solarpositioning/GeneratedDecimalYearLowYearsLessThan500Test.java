package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYearLowYearsLessThan500Test {

    @Test
    public void decimalYearLowYearsLessThan500Test() {
        LocalDate date = LocalDate.of(-600, 1, 1);
        double year = DeltaT.decimalYear(date);
        assertEquals(-600 + (date.getMonthValue() - 0.5) / 12, year, 0.01);
    }

}