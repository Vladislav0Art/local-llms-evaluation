package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GeneratedEstimate_NearZeroYear {

    @Test
    public void estimate_NearZeroYear() {
        LocalDate forDate = LocalDate.of(-9999, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(20.0, result, ChronoUnit.SECONDS);
    }

}