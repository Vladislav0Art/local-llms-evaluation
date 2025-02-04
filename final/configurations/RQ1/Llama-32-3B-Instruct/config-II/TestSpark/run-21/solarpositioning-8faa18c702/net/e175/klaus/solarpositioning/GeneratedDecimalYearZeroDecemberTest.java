package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYearZeroDecemberTest {

    @Test
    public void decimalYearZeroDecemberTest() {
        LocalDate date = LocalDate.of(2022, 12, 1);
        double result = DeltaT.decimalYear(date);
        assertEquals(-4, (int) result, 0);
    }

}