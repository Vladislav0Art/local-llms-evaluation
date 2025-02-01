package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1920And1941Test {

    @Test
    public void estimateYearBetween1920And1941Test() {
        LocalDate date = LocalDate.of(1935, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(28.8571, result, 0.005);
    }

}