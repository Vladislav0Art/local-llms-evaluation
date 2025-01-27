package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimateDeltaT_WhenDateIsNotToday NorYesterday NorInTheFuture_ReturnEstimatedDeltaT {

    @Test
    public void estimateDeltaT_WhenDateIsNotToday

    NorYesterday NorInTheFuture_ReturnEstimatedDeltaT() {
        LocalDate date = LocalDate.now().plusDays(30);
        double deltaT = 15;
        assertEquals(deltaT, DeltaT.estimate(date), 0.001);
    }

}