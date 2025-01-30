package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearFromNineteenFortyOneToNineteenSixtyOneTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearFromNineteenFortyOneToNineteenSixtyOneTest() {
        LocalDate forDate = LocalDate.of(1950, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 34.220000000000006);
    }

}