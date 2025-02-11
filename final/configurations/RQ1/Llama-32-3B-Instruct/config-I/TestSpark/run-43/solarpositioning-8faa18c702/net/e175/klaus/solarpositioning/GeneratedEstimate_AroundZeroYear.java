package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GeneratedEstimate_AroundZeroYear {

    @Test
    public void estimate_AroundZeroYear() {
        LocalDate forDate = LocalDate.of(0, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(10583.6, result, ChronoUnit.SECONDS);
    }

}