package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween2050And2150Test {

    @Test
    public void estimateYearBetween2050And2150Test() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(122.4458, result, 0.005);
    }

}