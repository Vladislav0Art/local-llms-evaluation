package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1941Test {

    @Test
    public void estimateYearBefore1941Test() {
        LocalDate date = LocalDate.of(1930, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(24.1917632, result, 0.001);
    }

}