package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(2025, 7, 20);
        double deltaT = DeltaT.estimate(futureDate);

        // check if deltaT is calculated and not a NaN
        assertFalse(Double.isNaN(deltaT));
    }

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1955, 1, 1);
        double deltaT = DeltaT.estimate(pastDate);

        // check if deltaT is calculated and not a NaN
        assertFalse(Double.isNaN(deltaT));
    }

    @Test
    public void estimateCurrentDateTest() {
        LocalDate currentDate = LocalDate.now();
        double deltaT = DeltaT.estimate(currentDate);

        // check if deltaT is calculated and not a NaN
        assertFalse(Double.isNaN(deltaT));
    }

    @Test
    public void estimateNullDateTest() {
        LocalDate nullDate = null;
        DeltaT.estimate(nullDate);
    }

}