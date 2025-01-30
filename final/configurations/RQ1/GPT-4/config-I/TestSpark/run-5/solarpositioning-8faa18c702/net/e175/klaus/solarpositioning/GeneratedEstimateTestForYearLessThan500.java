package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForYearLessThan500 {

    @Test
    public void estimateTestForYearLessThan500() {
        LocalDate date = LocalDate.of(400, 8, 10);
        double result = DeltaT.estimate(date);
        assertEquals(5947.77, result, 0.01);
    }

}