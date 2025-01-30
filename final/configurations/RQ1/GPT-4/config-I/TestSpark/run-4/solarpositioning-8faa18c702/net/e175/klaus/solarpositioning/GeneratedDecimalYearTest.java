package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedDecimalYearTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void decimalYearTest() {
        LocalDate forDate = LocalDate.of(2200, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 680.3399999999999);
    }

}