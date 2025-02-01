package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1800And1860Test {

    @Test
    public void estimateYearBetween1800And1860Test() {
        LocalDate date = LocalDate.of(1850, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(7.641, result, 0.005);
    }

}