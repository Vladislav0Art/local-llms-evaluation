package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForYearLessThan1900 {

    @Test
    public void estimateTestForYearLessThan1900() {
        LocalDate date = LocalDate.of(1880, 8, 10);
        double result = DeltaT.estimate(date);
        assertEquals(5.58, result, 0.01);
    }

}