package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore500Test {

    @Test
    public void estimateYearBefore500Test() {
        LocalDate date = LocalDate.of(400, 3, 10);
        double result = DeltaT.estimate(date);
        assertEquals(4190.496, result, 0.001);
    }

}