package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedTestNonNegativeResultForPositiveYearTest {

    @Test
    public void testNonNegativeResultForPositiveYearTest() {
        LocalDate forDate = LocalDate.of(2001, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result > 0);
    }

}