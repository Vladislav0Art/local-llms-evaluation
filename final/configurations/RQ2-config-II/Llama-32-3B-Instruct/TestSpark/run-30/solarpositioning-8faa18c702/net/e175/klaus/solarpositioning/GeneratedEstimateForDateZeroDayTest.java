package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateForDateZeroDayTest {

    @Test
    public void estimateForDateZeroDayTest() {
        LocalDate date = LocalDate.of(1970, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(365.242199, result, 0.00001);
    }

}