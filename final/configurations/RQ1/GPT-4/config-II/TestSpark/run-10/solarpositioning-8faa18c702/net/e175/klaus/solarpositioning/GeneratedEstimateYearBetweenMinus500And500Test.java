package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetweenMinus500And500Test {

    @Test
    public void estimateYearBetweenMinus500And500Test() {
        LocalDate date = LocalDate.of(0, 7, 1);
        assertTrue(DeltaT.estimate(date) == 10043.75);
    }

}