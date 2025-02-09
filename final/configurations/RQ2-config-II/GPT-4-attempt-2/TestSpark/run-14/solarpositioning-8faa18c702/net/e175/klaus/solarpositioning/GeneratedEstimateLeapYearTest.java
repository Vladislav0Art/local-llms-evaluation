package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateLeapYearTest {

    @Test
    public void estimateLeapYearTest() {
        LocalDate date = LocalDate.of(2024, 2, 29);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(72.15, result, 0.01);
    }

}