package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1600Test {

    @Test
    public void estimateYearBefore1600Test() {
        LocalDate date = LocalDate.of(1500, 4, 15);
        double result = DeltaT.estimate(date);
        assertEquals(8681.993, result, 0.001);
    }

}