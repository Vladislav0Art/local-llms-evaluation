package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import net.e175.klaus.solarpositioning.DeltaT;

import java.time.LocalDate;

public class GeneratedEstimateLeapYearDateTest {

    @Test
    public void estimateLeapYearDateTest() {
        LocalDate leapYearDate = LocalDate.of(2024, 2, 29);
        Assert.assertNotEquals(0.0, DeltaT.estimate(leapYearDate), 0.001);
    }

}