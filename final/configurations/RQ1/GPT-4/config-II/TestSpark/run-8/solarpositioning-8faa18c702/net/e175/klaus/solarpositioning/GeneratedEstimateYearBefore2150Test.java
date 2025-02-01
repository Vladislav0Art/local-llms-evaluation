package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore2150Test {

    @Test
    public void estimateYearBefore2150Test() {
        LocalDate date = LocalDate.of(2100, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(80.6356, result, 0.001);
    }

}