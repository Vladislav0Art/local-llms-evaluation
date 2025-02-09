package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
        } catch (Exception e) {
            Assert.assertTrue(e instanceof NullPointerException);
            Assert.assertEquals("forDate can't be null", e.getMessage());
        }
    }

}