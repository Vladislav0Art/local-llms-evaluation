package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearFromEightenSixtyToNineteenHundredTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearFromEightenSixtyToNineteenHundredTest() {
        LocalDate forDate = LocalDate.of(1880, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 0.5466934030627632);
    }

}