package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYearZeroJanuaryTest {

    @Test
    public void decimalYearZeroJanuaryTest() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double result = DeltaT.decimalYear(date);
        assertEquals(23, (int) result, 0);
    }

}