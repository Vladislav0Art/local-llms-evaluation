package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearFromNineteenSixtyOneToNineteenEightySixTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearFromNineteenSixtyOneToNineteenEightySixTest() {
        LocalDate forDate = LocalDate.of(1970, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 53.1825);
    }

}