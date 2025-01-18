package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate date = LocalDate.of(5000, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(7528.34, deltaT, 0.01);
    }

}