package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForYearLessThan1941 {

    @Test
    public void estimateTestForYearLessThan1941() {
        LocalDate date = LocalDate.of(1935, 8, 10);
        double result = DeltaT.estimate(date);
        assertEquals(24.62, result, 0.01);
    }

}