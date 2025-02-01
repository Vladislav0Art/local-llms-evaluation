package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDecimalYearTest {

    @Test
    public void decimalYearTest() {
        LocalDate localDate = LocalDate.of(2150, 12, 20);
        double expected = 2150.5;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}