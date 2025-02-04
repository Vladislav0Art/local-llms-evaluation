package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecimalYearHighMonthHighDayTest {

    @Test
    public void testDecimalYearHighMonthHighDayTest() {
        LocalDate forDate = LocalDate.of(2150, 11, 1);
        assertEquals(-19.8, net.e175.klaus.solarpositioning.DeltaT.decimalYear(forDate), 0.01);
    }

}