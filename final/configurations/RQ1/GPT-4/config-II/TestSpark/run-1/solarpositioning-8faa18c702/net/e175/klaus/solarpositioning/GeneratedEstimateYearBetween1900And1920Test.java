package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1900And1920Test {

    @Test
    public void estimateYearBetween1900And1920Test() {
        LocalDate date = LocalDate.of(1915, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(14.0805, result, 0.005);
    }

}