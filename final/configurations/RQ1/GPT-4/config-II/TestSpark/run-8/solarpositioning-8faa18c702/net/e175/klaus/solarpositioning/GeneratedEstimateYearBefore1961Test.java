package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1961Test {

    @Test
    public void estimateYearBefore1961Test() {
        LocalDate date = LocalDate.of(1950, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(29.4250, result, 0.001);
    }

}