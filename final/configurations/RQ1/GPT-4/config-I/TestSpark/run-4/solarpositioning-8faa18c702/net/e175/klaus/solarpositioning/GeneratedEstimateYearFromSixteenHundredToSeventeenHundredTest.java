package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearFromSixteenHundredToSeventeenHundredTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearFromSixteenHundredToSeventeenHundredTest() {
        LocalDate forDate = LocalDate.of(1650, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 113.43761566066824);
    }

}