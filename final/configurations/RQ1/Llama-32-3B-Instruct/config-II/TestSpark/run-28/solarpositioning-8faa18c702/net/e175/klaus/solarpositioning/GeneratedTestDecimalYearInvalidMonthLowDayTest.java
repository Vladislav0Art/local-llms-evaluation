package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecimalYearInvalidMonthLowDayTest {

    @Test
    public void testDecimalYearInvalidMonthLowDayTest() {
        LocalDate forDate = LocalDate.of(500, 12, 32);
        assertEquals(Double.NaN, net.e175.klaus.solarpositioning.DeltaT.decimalYear(forDate));
    }

}