package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateNonLeapYearTest {

    @Test
    public void estimateNonLeapYearTest() {
        LocalDate date = LocalDate.of(2023, 2, 28);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(71.30, result, 0.01);
    }

}