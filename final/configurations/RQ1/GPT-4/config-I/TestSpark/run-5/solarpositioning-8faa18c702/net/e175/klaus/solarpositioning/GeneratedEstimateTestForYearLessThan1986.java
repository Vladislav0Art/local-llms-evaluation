package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForYearLessThan1986 {

    @Test
    public void estimateTestForYearLessThan1986() {
        LocalDate date = LocalDate.of(1980, 8, 10);
        double result = DeltaT.estimate(date);
        assertEquals(50.54, result, 0.01);
    }

}