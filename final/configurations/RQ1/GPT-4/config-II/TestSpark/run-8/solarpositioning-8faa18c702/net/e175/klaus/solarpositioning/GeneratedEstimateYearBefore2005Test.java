package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore2005Test {

    @Test
    public void estimateYearBefore2005Test() {
        LocalDate date = LocalDate.of(2000, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(65.4550011, result, 0.001);
    }

}