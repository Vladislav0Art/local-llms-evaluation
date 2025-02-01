package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween500And1600Test {

    @Test
    public void estimateYearBetween500And1600Test() {
        LocalDate date = LocalDate.of(1500, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(1243.7, result, 0.005);
    }

}