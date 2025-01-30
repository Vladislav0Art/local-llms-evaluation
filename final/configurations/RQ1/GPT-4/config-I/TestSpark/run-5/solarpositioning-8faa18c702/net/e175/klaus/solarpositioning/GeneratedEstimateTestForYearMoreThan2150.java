package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForYearMoreThan2150 {

    @Test
    public void estimateTestForYearMoreThan2150() {
        LocalDate date = LocalDate.of(2200, 8, 10);
        double result = DeltaT.estimate(date);
        assertEquals(417.6, result, 0.01);
    }

}