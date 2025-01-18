package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateLeapYearTest {

    @Test
    public void estimateLeapYearTest() {
        // February 29, 2024 is a leap year.
        double deltaT = DeltaT.estimate(LocalDate.of(2024, 2, 29));
        Assert.assertEquals(70.04, deltaT, 0.01);
    }

}