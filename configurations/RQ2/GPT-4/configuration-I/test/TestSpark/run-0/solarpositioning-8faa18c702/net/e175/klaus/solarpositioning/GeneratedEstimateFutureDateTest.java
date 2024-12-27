package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(2025, 7, 20);
        double deltaT = DeltaT.estimate(futureDate);

        // check if deltaT is calculated and not a NaN
        assertFalse(Double.isNaN(deltaT));
    }

}