package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetweenMinus500And500Test {

    @Test
    public void estimateYearBetweenMinus500And500Test() {
        LocalDate date = LocalDate.of(0, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(10583.6, result, 0.005);
    }

}