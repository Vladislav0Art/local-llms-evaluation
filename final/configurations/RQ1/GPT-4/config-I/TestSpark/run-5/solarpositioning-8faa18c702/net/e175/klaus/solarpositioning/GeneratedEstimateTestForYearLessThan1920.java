package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForYearLessThan1920 {

    @Test
    public void estimateTestForYearLessThan1920() {
        LocalDate date = LocalDate.of(1910, 8, 10);
        double result = DeltaT.estimate(date);
        assertEquals(-3.31, result, 0.01);
    }

}