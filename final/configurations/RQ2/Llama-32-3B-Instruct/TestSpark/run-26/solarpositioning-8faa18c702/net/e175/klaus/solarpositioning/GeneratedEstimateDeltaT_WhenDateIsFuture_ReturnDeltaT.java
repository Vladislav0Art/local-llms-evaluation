package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimateDeltaT_WhenDateIsFuture_ReturnDeltaT {

    @Test
    public void estimateDeltaT_WhenDateIsFuture_ReturnDeltaT() {
        LocalDate date = LocalDate.now().plusDays(1);
        double deltaT = 15;
        assertEquals(deltaT, (double) DeltaT.estimate(date), 0.001);
    }

}