package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1941And1961Test {

    @Test
    public void estimateYearBetween1941And1961Test() {
        LocalDate date = LocalDate.of(1955, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(31.5250, result, 0.005);
    }

}