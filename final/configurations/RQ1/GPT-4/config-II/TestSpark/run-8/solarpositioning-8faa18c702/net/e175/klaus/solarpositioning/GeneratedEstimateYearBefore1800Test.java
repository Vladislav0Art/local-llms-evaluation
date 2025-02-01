package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1800Test {

    @Test
    public void estimateYearBefore1800Test() {
        LocalDate date = LocalDate.of(1750, 6, 30);
        double result = DeltaT.estimate(date);
        assertEquals(9.7178395, result, 0.001);
    }

}