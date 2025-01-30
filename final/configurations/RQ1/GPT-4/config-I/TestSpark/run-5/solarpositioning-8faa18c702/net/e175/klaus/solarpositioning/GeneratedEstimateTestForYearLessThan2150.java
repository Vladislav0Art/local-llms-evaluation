package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForYearLessThan2150 {

    @Test
    public void estimateTestForYearLessThan2150() {
        LocalDate date = LocalDate.of(2100, 8, 10);
        double result = DeltaT.estimate(date);
        assertEquals(123.23, result, 0.01);
    }

}