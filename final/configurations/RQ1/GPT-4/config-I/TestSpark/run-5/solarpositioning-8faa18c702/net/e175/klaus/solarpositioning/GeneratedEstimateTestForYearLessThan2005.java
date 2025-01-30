package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForYearLessThan2005 {

    @Test
    public void estimateTestForYearLessThan2005() {
        LocalDate date = LocalDate.of(2000, 8, 10);
        double result = DeltaT.estimate(date);
        assertEquals(64.30, result, 0.01);
    }

}