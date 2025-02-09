package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            Assert.fail("IllegalArgumentException is expected");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("forDate cannot be null", e.getMessage());
        }
    }

}