package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateWithNullDateTest {

    @Test
    public void estimateWithNullDateTest() {
        LocalDate forDate = null;
        double expected = 0.0;
        double actual = DeltaT.estimate(forDate);
        assertEquals(expected, actual, 0.0);
    }

}