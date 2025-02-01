package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore2050Test {

    @Test
    public void estimateYearBefore2050Test() {
        LocalDate date = LocalDate.of(2040, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(76.137978, result, 0.001);
    }

}