package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimateForDateInvalidTest {

    @Test
    public void estimateForDateInvalidTest() {
        LocalDate date = LocalDate.of(2022, 13, 1);
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(date));
    }

}