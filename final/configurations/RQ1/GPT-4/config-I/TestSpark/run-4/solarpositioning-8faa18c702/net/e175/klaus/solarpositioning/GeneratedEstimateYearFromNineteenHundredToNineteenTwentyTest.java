package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearFromNineteenHundredToNineteenTwentyTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearFromNineteenHundredToNineteenTwentyTest() {
        LocalDate forDate = LocalDate.of(1910, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == -1.7939700629805917);
    }

}