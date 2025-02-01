package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1700And1800Test {

    @Test
    public void estimateYearBetween1700And1800Test() {
        LocalDate date = LocalDate.of(1750, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(15.16, result, 0.005);
    }

}