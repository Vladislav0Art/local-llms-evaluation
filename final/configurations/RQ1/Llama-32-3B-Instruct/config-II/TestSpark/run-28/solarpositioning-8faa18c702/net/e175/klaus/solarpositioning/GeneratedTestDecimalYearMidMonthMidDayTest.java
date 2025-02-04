package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecimalYearMidMonthMidDayTest {

    @Test
    public void testDecimalYearMidMonthMidDayTest() {
        LocalDate forDate = LocalDate.of(1000, 6, 1);
        assertEquals(10.5, net.e175.klaus.solarpositioning.DeltaT.decimalYear(forDate), 0.01);
    }

}