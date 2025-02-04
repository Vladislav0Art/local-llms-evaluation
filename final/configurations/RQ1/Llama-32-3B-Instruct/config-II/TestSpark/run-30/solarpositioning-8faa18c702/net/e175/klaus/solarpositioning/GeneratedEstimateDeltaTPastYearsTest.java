package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTPastYearsTest {

    @Test
    public void estimateDeltaTPastYearsTest() {
        LocalDate forDate = LocalDate.of(1901, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -2400 && result <= 700);
    }

}