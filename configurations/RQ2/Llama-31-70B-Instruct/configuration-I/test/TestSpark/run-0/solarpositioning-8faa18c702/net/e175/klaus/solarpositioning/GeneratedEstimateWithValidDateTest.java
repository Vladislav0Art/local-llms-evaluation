package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateWithValidDateTest {

    @Test
    public void estimateWithValidDateTest() {
        LocalDate forDate = LocalDate.of(2020, 1, 1);
        double expected = 67.0;
        double actual = DeltaT.estimate(forDate);
        assertEquals(expected, actual, 0.0);
    }

}